public class MatrixRow {
    private ValueNode first;
    private MatrixRow next;


    public ValueNode getFirst() {
        return first;
    }

    public MatrixRow getNext() {
        return next;
    }

    public void setNext(MatrixRow next) {
        this.next = next;
    }

    public void insert(ValueNode value) {
        rowPointer = first;
        for (int i = 0 -> value.getColumn; i++){
            rowPointer = rowPointer.getNextColumn();
        }
    }

    public int get(int position) {
        return 0;
    }

}
