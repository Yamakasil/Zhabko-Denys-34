import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {
        Calculation calculation = new Calculation(10, 20, 30);
        try {
            FileOutputStream fileOut = new FileOutputStream("calculation.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(calculation);
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }

        Calculation deserializedCalculation = null;
        try {
            FileInputStream fileIn = new FileInputStream("calculation.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            deserializedCalculation = (Calculation) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();
            return;
        }

        System.out.println("parameter1 = " + deserializedCalculation.getParameter1());
        System.out.println("parameter2 = " + deserializedCalculation.getParameter2());
        System.out.println("result = " + deserializedCalculation.getResult());
    }
}
