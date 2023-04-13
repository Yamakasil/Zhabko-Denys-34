public class TableResultDisplay extends ResultDisplay {
    private int numRows;
    private int numCols;

    public TableResultDisplay(int numRows, int numCols) {
        this.numRows = numRows;
        this.numCols = numCols;
    }

    @Override
    public void displayResults(CalculationResult result) {
        System.out.println("Table display of results: ");
        // Display table with numRows and numCols, using result data
    }
}
