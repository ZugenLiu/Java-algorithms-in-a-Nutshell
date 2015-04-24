package searching.trees;


public class BinaryNode<T extends Comparable> {
    /**
     * Left son.
     */
    private BinaryNode<T> left;

    /**
     * Right son.
     */
    private BinaryNode<T> right;

    /**
     * Value.
     */
    private T value;

    public BinaryNode(T value) {
        if (value == null) {
            throw new IllegalArgumentException("BinaryTree cannot store 'null' values.");
        }

        left = null;
        right = null;
        this.value = value;
    }


    public BinaryNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<T> left) {
        this.left = left;
    }

    public BinaryNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryNode<T> right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
