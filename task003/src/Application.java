import java.util.Scanner;
import task003.ResultDisplay;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the height of the triangle and rectangle:");
        double height = scanner.nextDouble();

        System.out.println("Enter the base of the triangle and rectangle:");
        double base = scanner.nextDouble();

        TriangleRectangleCalculator calculator = new TriangleRectangleCalculator();
        CalculationResult result = calculator.calculate(height, base);

        System.out.println("Enter the result display type (text):");
        String displayType = scanner.next();

        ResultDisplayFactory factory = new TextResultDisplayFactory();
                reateResultDisplay(displayType);

    }

    private static void reateResultDisplay(String displayType) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
