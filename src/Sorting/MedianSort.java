package Sorting;

import java.util.Random;

public class MedianSort {
    public static int[] sort(int[] a) {
        return medianSort(a, 0, a.length - 1);
    }

    private static int[] medianSort(int[] a, int left, int right) {
        if (left < right) {
            int midpoint = (right - left + 1) / 2;
            selectKth(a, midpoint + 1, left, right);
            medianSort(a, left, left + midpoint - 1);
            medianSort(a, left + midpoint + 1, right);
        }
        return a;
    }

    private static int selectKth(int[] a, int k, int left, int right) {

        int idx = selectPivotIndex(a, left, right);
        int pivotIndex = partition(a, left, right, idx);
        if (left + k - 1 == pivotIndex) {
            return pivotIndex;
        }
        /* continue the loop, narrowing the range as appropriate. If we are within
         * the left-hand side of the pivot then k can stay the same. */
        if (left + k - 1 < pivotIndex) {
            return selectKth(a, k, left, pivotIndex - 1);
        } else {
            return selectKth(a, k - (pivotIndex - left + 1), pivotIndex + 1, right);
        }
    }

    // Random strategy
    private static int selectPivotIndex(int[] a, int left, int right) {
        return (new Random().nextInt(right - left + 1) + left);
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



