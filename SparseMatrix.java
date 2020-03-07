
public class SparseMatrix {
    private int totalRows;
    private int totalColumns;
    private MatrixRow firstRow;
    private MatrixColumn firstColumn;

    public SparseMatrix(int rows, int columns) {
        this.totalRows = rows;
        this.totalColumns = columns;
        // initialize this.firstColumn to a new MatrixColumn
        firstColumn =  new MatrixColumn;
        // create a temp pointer to firstColumn
         MatrixColumn firstPointer = firstColumn;
        for(int i = 0 -> totalColumns) {
            // set the temp pointer's  to a new MatrixColumn
            firstPointer.setNext(new MatrixColumn);  // set the next cols and rows,
            // update the temp pointer to its successor
            firstPointer = firstPointer.getNext(); // the actual moving of each row and col.
        }

        // initialize this.firstRow to a new MatrixRow
        firstRow = new MatrixRow;
        // create a temp pointer to firstRow
        MatrixRow rowPointer = firstRow;
        for(int i = 0 -> totalRows){
            // set the temp pointer's successor to a new MatrixRow
            // update the temp pointer to its successor
            rowPointer.setNext(new MatrixRow);
            rowPointer = rowPointer.getNext(); //
        }
    }

    public void insert(int row, int column, int value) {
        // create a ValueNode for this row, column, value
        ValueNode v1 = new ValueNode(row, column, value);
        // get the MatrixRow of row
        // insert the ValueNode into the row
        MatrixColumn firstPointer; // call insert
        firstPointer = firstColumn;
        MatrixRow = rowPointer; // call insert
        rowPointer = firstRow;

        for (int i = 0 -> column, i++){
            firstPointer = firstPointer.getNext();
        }
        for (int i = 0 -> row, i++){
            rowPointer = rowPointer.getNext();
        }
        // get the MatrixColumn of column
        // insert the same ValueNode into the column
        firstPointer.insert(v1);
        rowPointer.insert(v1);
    }

    public MatrixRow getRow(int position) {
        return null;
    }

    public MatrixColumn getColumn(int position) {
        return null;
    }

    public int getValue(int row, int column) {
        return 0;
    }

    public void print() {

    }

    public SparseMatrix transpose() {
        return null;
    }

    public SparseMatrix produce(SparseMatrix other) {
        return null;
    }
}
