package searching.trees;

/**
 * Common interface for trees
 */
public interface Tree<T extends Comparable> {

    public T search(T key);

    public void insert(T key);

    public boolean remove(T key);

    public void clear();
}
