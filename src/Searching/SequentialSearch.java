package searching;

import java.util.Iterator;

public class SequentialSearch<T> {
    /**
     * Apply the brute-force Sequential Search algorithm to search the
     * indexed collection (of type T) for the given target item.
     */
    public boolean sequentialSearch(T[] collection, T t) {
        for (T item : collection) {
            if (item.equals(t)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Apply the brute-force Sequential Search algorithm to search the
     * iterable collection (of type T) for the given target item.
     */
    public boolean sequentialSearch(Iterable<T> collection, T t) {
        Iterator<T> iter = collection.iterator();
        while (iter.hasNext()) {
            if (iter.next().equals(t)) {
                return true;
            }
        }
        return false;
    }
}