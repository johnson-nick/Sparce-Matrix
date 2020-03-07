public class MatrixColumn {
    private ValueNode first;
    private MatrixColumn next;


    public ValueNode getFirst() {
        return first;
    }

    public MatrixColumn getNext() {
        return next;
    }

    public void setNext(MatrixColumn next) {
        this.next = next;
    }

    public void insert(ValueNode value) {
        firstPointer = first;
        for (int i = 0 -> value.getRow(); i++){
            firstPointer = firstPointer.getNextRow();
        }
    }

    public int get(int position) {
        return 0;
    }
}
