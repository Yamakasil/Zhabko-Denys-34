
import task003.ResultDisplay;

public class ResultDisplayFactory {

    public static TextResultDisplay createResultDisplay(String displayType) {
        if (displayType.equalsIgnoreCase("TEXT")) {
            return new TextResultDisplay();
        } else if (displayType.equalsIgnoreCase("GRAPHICAL")) {
            return new TextResultDisplay();
        } else {
            throw new IllegalArgumentException("Invalid display type: " + displayType);
        }
    }
    ResultDisplay c1;
}
