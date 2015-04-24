package searching.trees;

/**
 * Implements unbalanced simple binary tree
 */
public class UnbalancedBinaryTree<T extends Comparable> implements Tree<T> {

    /**
     * Root of the tree.
     */
    private BinaryNode<T> root;

    public UnbalancedBinaryTree() {
        root = null;
    }


    @Override
    public T search(T key) {
        BinaryNode<T> p = root;
        while (p != null) {
            int cmp = key.compareTo(p.getValue());
            if (cmp == 0) {
                return p.getValue();
            } else if (cmp < 0) {
                p = p.getLeft();
            } else {
                p = p.getRight();
            }
        }
        //if it is not found
        return null;
    }

    @Override
    public void insert(T key) {
        root = insert(root, key);
        return;
    }


    private BinaryNode<T> insert(BinaryNode<T> p, T value) {
        if (p == null)
            return new BinaryNode<T>(value);
        else if (value.compareTo(p.getValue()) < 0)
            p.setLeft(insert(p.getLeft(), value));
        else if (value.compareTo(p.getValue()) >= 0)
            p.setRight(insert(p.getRight(), value));

        return p;
    }


    @Override
    public boolean remove(T key) {
        root = delete(root, key);
        return true;
    }

    private BinaryNode<T> delete(BinaryNode<T> p, T key) {
        if (p == null) throw new RuntimeException("cannot delete.");
        else if (key.compareTo(p.getValue()) < 0)
            p.setLeft(delete(p.getLeft(), key));
        else if (key.compareTo(p.getValue()) > 0)
            p.setRight(delete(p.getRight(), key));
        else {
            if (p.getLeft() == null) return p.getRight();
            else if (p.getRight() == null) return p.getLeft();
            else {
                // get data from the rightmost node in the left subtree
                p.setValue(retrieveData(p.getLeft()));
                // delete the rightmost node in the left subtree
                p.setLeft(delete(p.getLeft(), p.getValue()));
            }
        }
        return p;
    }

    private T retrieveData(BinaryNode<T> p) {
        while (p.getRight() != null) p = p.getRight();

        return p.getValue();
    }


    @Override
    public void clear() {
        root = null;
    }
}
