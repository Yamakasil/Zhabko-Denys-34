public class CalculatorResult {
    public Calculation calculate(double parameter1, double parameter2) {
        double result = parameter1 + parameter2;
        return new Calculation(parameter1, parameter2, result);
    }
}
