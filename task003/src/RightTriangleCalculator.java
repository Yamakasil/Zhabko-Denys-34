public class RightTriangleCalculator extends TriangleRectangleCalculator {
    private double hypotenuse;

    public RightTriangleCalculator(double base, double height, double hypotenuse) {
        super(base, height);
        this.hypotenuse = hypotenuse;
    }

    // Overriding calculateArea method
    @Override
    public double calculateArea() {
        return 0.5 * super.calculateArea();
    }

    // Overloading calculateArea method
    public double calculateArea(double scaleFactor) {
        return scaleFactor * calculateArea();
    }

    // Dynamic method dispatch
    public void printArea() {
        System.out.println("Area of right triangle is: " + calculateArea());
    }
}
