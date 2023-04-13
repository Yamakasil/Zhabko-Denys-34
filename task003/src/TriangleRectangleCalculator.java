public class TriangleRectangleCalculator {
    private double base;
    private double height;

    public TriangleRectangleCalculator(double base, double height) {
        this.base = base;
        this.height = height;
    }

    TriangleRectangleCalculator() {
         new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double calculateTrianglePerimeter() {
        double hypotenuse = Math.sqrt(Math.pow(base / 2, 2) + Math.pow(height, 2));
        return base + 2 * hypotenuse;
    }

    public double calculateRectanglePerimeter() {
        return 2 * (base + height);
    }

    CalculationResult calculate(double height, double base) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
