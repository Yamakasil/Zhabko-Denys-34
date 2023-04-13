import java.text.DecimalFormat;
import task003.ResultDisplay;

public class TextResultDisplay extends ResultDisplay {

    private DecimalFormat decimalFormat;

    public TextResultDisplay() {
        this.decimalFormat = new DecimalFormat("#.##");
    }

    public void displayResult(CalculationResult result) {
        System.out.println("Triangle perimeter: " + decimalFormat.format(result.getTrianglePerimeter()));
        System.out.println("Rectangle perimeter: " + decimalFormat.format(result.getRectanglePerimeter()));
        System.out.println("Sum of perimeters: " + decimalFormat.format(result.getSumOfPerimeters()));
    }
}
