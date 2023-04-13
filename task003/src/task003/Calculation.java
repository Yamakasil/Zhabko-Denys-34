import java.io.Serializable;

public class Calculation implements Serializable {
    private double base;
    private double height;
    private double perimeter;

    public Calculation(double base, double height, double perimeter) {
        this.base = base;
        this.height = height;
        this.perimeter = perimeter;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getPerimeter() {
        return perimeter;
    }
}
