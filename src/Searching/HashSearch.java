package searching;


import java.util.Iterator;
import java.util.LinkedList;

public class HashSearch<V> {
    private LinkedList<V>[] listTable;
    private int tableSize;


    public void load(Iterator<V> it, int size) {
        tableSize = size;
        listTable = (LinkedList<V>[]) new LinkedList[tableSize];
        // Pull each value from the iterator and find desired bin h.
        // Add to existing list or create new one into which value is added.
        while (it.hasNext()) {
            V v = it.next();
            int h = this.hash(v);
            if (listTable[h] == null) {
                listTable[h] = new LinkedList<V>();
            }
            // Add element into linked list for bin 'h'
            LinkedList<V> list = (LinkedList<V>) listTable[h];
            list.add(v);
        }
    }

    public boolean search(V v) {
        int h = this.hash(v);
        LinkedList<V> list = (LinkedList<V>) listTable[h];
        if (list == null) {
            return false;
        }
        return list.contains(v);
    }

    // The following is the implementation of the hash method above.
    public int hash(V v) {
        int h = v.hashCode();
        if (h < 0) {
            h = 0 - h;
        }
        return h % tableSize;
    }
}
