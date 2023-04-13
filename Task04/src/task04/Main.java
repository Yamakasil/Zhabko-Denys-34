package task04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Vvedit visotu trikutnika: ");
        double height = scanner.nextDouble();
        
        System.out.print(" Vvedit dovjinu osnovu trikutnika: ");
        double base = scanner.nextDouble();
        
        System.out.print("Vvedite dovjinu pryamokutnika: ");
        double rectangleLength = scanner.nextDouble();
        
        System.out.print("Vvedite shirinu pryamokutnika: ");
        double rectangleWidth = scanner.nextDouble();
        
        double perimeter = calculatePerimeter(height, base, rectangleLength, rectangleWidth);
        
        int binaryOnesCount = countBinaryOnes(perimeter);
        
        System.out.println("Kilkist odinits u dviykovomu podanni perumetru: " + binaryOnesCount);
        
        displayTable(perimeter, binaryOnesCount);
    }
    
    public static double calculatePerimeter(double height, double base, double rectangleLength, double rectangleWidth) {
        double triangleSide = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2));
        double trianglePerimeter = 2 * triangleSide + base;
        double rectanglePerimeter = 2 * (rectangleLength + rectangleWidth);
        return trianglePerimeter + rectanglePerimeter;
    }
    
    public static int countBinaryOnes(double number) {
        int binaryOnesCount = 0;
        String binaryString = Integer.toBinaryString((int) number);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                binaryOnesCount++;
            }
        }
        return binaryOnesCount;
    }
    
    public static void displayTable(double perimeter, int binaryOnesCount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vvedite kilkist ryadkid v tablitsi: ");
        int rows = scanner.nextInt();
        
        System.out.print("Vvedite kilkist stovptsiv tablutsi: ");
        int columns = scanner.nextInt();
        
        String[][] table = new String[rows][columns];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0) {
                    table[i][j] = "Perimeter: " + perimeter;
                } else if (i == 1) {
                    table[i][j] = "Binary ones count: " + binaryOnesCount;
                } else {
                    table[i][j] = " ";
                }
            }
        }
        
        System.out.println("Tablitsa result:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
System.out.printf("%-25s", table[i][j]);
}
System.out.println();
}
}
}

class ShapeTester {
public static void main(String[] args) {
// Тестування методу calculatePerimeter з перевизначенням
    double height = 10;
    double base = 20;
    double rectangleLength = 15;
    double rectangleWidth = 10;
    
    ShapeTester shapeTester = new ShapeTester();
    double perimeter = shapeTester.calculatePerimeter(height, base, rectangleLength, rectangleWidth);
    System.out.println("Perimeter: " + perimeter);
    
    Shape shape = new Shape();
    double trianglePerimeter = shape.calculatePerimeter(height, base);
    System.out.println("Triangle perimeter: " + trianglePerimeter);
    
    Rectangle rectangle = new Rectangle(rectangleLength, rectangleWidth);
    double rectanglePerimeter = rectangle.calculatePerimeter();
    System.out.println("Rectangle perimeter: " + rectanglePerimeter);
    
    // Тестування методу countBinaryOnes з перевантаженням
    
    int binaryOnesCount = shapeTester.countBinaryOnes(perimeter);
    System.out.println("Binary ones count: " + binaryOnesCount);
    
    int[] numbers = {1, 2, 3, 4, 5};
    int binaryOnesCount2 = shapeTester.countBinaryOnes(numbers);
    System.out.println("Binary ones count 2: " + binaryOnesCount2);
}

public double calculatePerimeter(double height, double base, double rectangleLength, double rectangleWidth) {
    double triangleSide = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2));
    double trianglePerimeter = 2 * triangleSide + base;
    double rectanglePerimeter = 2 * (rectangleLength + rectangleWidth);
    return trianglePerimeter + rectanglePerimeter;
}

public int countBinaryOnes(double number) {
    int binaryOnesCount = 0;
    String binaryString = Integer.toBinaryString((int) number);
    for (int i = 0; i < binaryString.length(); i++) {
        if (binaryString.charAt(i) == '1') {
            binaryOnesCount++;
        }
    }
    return binaryOnesCount;
}

public int countBinaryOnes(int[] numbers) {
    int binaryOnesCount = 0;
    for (int number : numbers) {
        String binaryString = Integer.toBinaryString(number);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                binaryOnesCount++;
            }
        }
    }
    return binaryOnesCount;
}
}

class Shape {
public double calculatePerimeter(double height, double base) {
double side = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2));
return 2 * side + base;
}
}

class Rectangle {
private double length;
private double width;
public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
}

public double calculatePerimeter() {
    return 2 * (length + width);
}
}
