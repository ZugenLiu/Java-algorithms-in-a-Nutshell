package Sorting;

/**
 * Created by USER on 16.04.2015.
 */
public class HeapSort {
    public static int[] sort(int[] a) {
        buildHeap(a);
        for (int i = a.length - 1; i >= 1; i--) {
            swap(a, 0, i);
            heapify(a, 0, i);
        }
        return a;
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static void buildHeap(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            heapify(a, i, a.length);
        }
    }

    private static void heapify(int[] a, int idx, int max) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        int largest;
        if (left < max && (a[left] > a[idx])) {
            largest = left;
        } else {
            largest = idx;
        }
        if (right < max && (a[right] > a[largest])) {
            largest = right;
        }

        if (largest != idx) {
            swap(a, idx, largest);
            heapify(a, largest, max);
        }
    }
}
