import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Calculator {
    private double height;
    private double baseLength;

    public Calculator(double height, double baseLength) {
        this.height = height;
        this.baseLength = baseLength;
    }

    public CalculationResult calculate() {
        double perimeterTriangle = 2 * Math.sqrt(Math.pow(baseLength / 2, 2) + Math.pow(height, 2)) + baseLength;
        double perimeterRectangle = 2 * (baseLength + height);
        return new CalculationResult(perimeterTriangle, perimeterRectangle);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public double getHeight() {
        return height;
    }

    public double getBaseLength() {
        return baseLength;
    }

    // Serialization methods
    public void saveState(String filePath) {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath));
        out.writeObject(this);
        out.close();
    }

    public static Calculator loadState(String filePath) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath));
            Calculator calculator = (Calculator) in.readObject();
            in.close();
            return calculator;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
