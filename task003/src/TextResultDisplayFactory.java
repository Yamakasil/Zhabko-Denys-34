
import task003.ResultDisplay;

public class TextResultDisplayFactory extends ResultDisplayFactory {

    public TextResultDisplayFactory() {
    }

    public ResultDisplay createResultDisplay() {
        return new ResultDisplay();
    }
}
