package sorting;


/*
   Visualization from https://www.cs.usfca.edu/~galles/visualization/BucketSort.html

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class BucketSort {

    public static int[] sort(int[] a, int n) {

        int num = numBuckets(n);
        ArrayList<LinkedList<Integer>> buckets = new ArrayList<LinkedList<Integer>>(num);
        for (int i = 0; i < num; i++)
            buckets.add(new LinkedList<Integer>());

        for (int i = 0; i < a.length; i++) {
            int k = hash(a[i], num);
            /** Insert each element and increment counts */
            Integer e = a[i];
            buckets.get(k).addLast(e);
        }
           /* now read out and overwrite ar. */
        extract(buckets, a, n);
        return a;
    }

    private static void extract(ArrayList<LinkedList<Integer>> buckets, int[] a, int n) {
        int idx = 0;
        for (int i = 0; i < buckets.size(); i++) {

            LinkedList<Integer> bucket = buckets.get(i);

            bucket = insertionSort(bucket);

            for (Iterator<Integer> iter = bucket.iterator(); iter.hasNext(); ) {
                a[idx++] = iter.next();
            }
        }
    }

    /*
       It changes bucket
     */
    private static LinkedList<Integer> insertionSort(LinkedList<Integer> bucket) {
        LinkedList<Integer> newBucket = new LinkedList<Integer>();
        for (Object value : insertionSort(bucket.toArray())) {
            newBucket.add((Integer) value);
        }
        return newBucket;
    }

    /**
     * Number of buckets to use is the same as the number of elements.
     */
    private static int numBuckets(int numElements) {

        return numElements;
    }

    /*
      You should define your own hash function
     */
    private static int hash(int elem, int n) {
        return elem / n;
    }


    public static Object[] insertionSort(Object[] a) {

        for (int i = 1; i < a.length; i++) {
            insert(a, i, (Integer) a[i]);
        }
        return a;
    }

    private static void insert(Object[] a, int pos, int value) {
        int i = pos - 1;
        while (i >= 0 && (Integer) a[i] > value) {
            a[i + 1] = a[i];
            i--;
        }
        a[i + 1] = value;
    }
}
