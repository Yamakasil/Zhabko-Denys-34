import java.io.Serializable;

public class CalculationResult implements Serializable {
    private String inputData;
    private double result;

    public CalculationResult(String inputData, double result) {
        this.inputData = inputData;
        this.result = result;
    }

    CalculationResult(double perimeterTriangle, double perimeterRectangle) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getInputData() {
        return inputData;
    }

    public double getResult() {
        return result;
    }

    public void setInputData(String inputData) {
        this.inputData = inputData;
    }

    public void setResult(double result) {
        this.result = result;
    }

    Object getTrianglePerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getRectanglePerimeter() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getSumOfPerimeters() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
