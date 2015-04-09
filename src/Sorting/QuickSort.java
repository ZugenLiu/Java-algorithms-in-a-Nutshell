package Sorting;

/**
 * QuickSort without optimization technique
 */
public class QuickSort {

    public static int[] sort(int[] a) {

        return quickSort(a, 0, a.length - 1);
    }

    public static int[] quickSort(int[] a, int left, int right) {
        int pivotIndex;
        if (left < right) {
            pivotIndex = selectPivotIndex(a, left, right);
            pivotIndex = partition(a, left, right, pivotIndex);

            quickSort(a, left, pivotIndex - 1);

            quickSort(a, pivotIndex + 1, right);
        }
        return a;
    }


    // Left element strategy
    private static int selectPivotIndex(int[] a, int left, int right) {
        return left;
    }

    private static int partition(int[] a, int left, int right, int pivotIndex) {
        int idx, store;
        int pivot = a[pivotIndex];
        /* move pivot to the end of the array */
        int tmp = a[right];
        a[right] = a[pivotIndex];
        a[pivotIndex] = tmp;
        /* all values <= pivot are moved to front of array and pivot inserted
         * just after them. */
        store = left;
        for (idx = left; idx < right; idx++) {
            if (a[idx] - pivot <= 0) {
                tmp = a[idx];
                a[idx] = a[store];
                a[store] = tmp;
                store++;
            }
        }
        tmp = a[right];
        a[right] = a[store];
        a[store] = tmp;
        return store;
    }
}
