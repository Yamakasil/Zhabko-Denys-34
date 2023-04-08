package task22;

public class Main {
    public static void main(String[] args) {
        int height = 5; // висота
        int base = 10; // довжина основи

        int trianglePerimeter = 2 * base + (int) (2 * Math.sqrt(Math.pow(base / 2.0, 2) + Math.pow(height, 2))); // периметр трикутника
        int rectanglePerimeter = 2 * (base + height); // периметр прямокутника
        int sum = trianglePerimeter + rectanglePerimeter; // сума периметрів

        String binaryString = Integer.toBinaryString(sum); // двійкове представлення суми периметрів
        int count = 0; // кількість 1

        for (char c : binaryString.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }

        System.out.println("The number 1 in the binary representation of the integer part of the sum of perimeters value: " + count);
    }
}
