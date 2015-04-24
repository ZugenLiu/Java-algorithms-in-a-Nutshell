package sorting;


public class SelectionSort {

    /* repeatedly select max in A[0,i] and swap with proper position */
    public static int[] sort(int[] a) {
        for (int i = a.length - 1; i >= 1; i--) {
            int maxPos = selectMax(a, 0, i);
            if (maxPos != i) {
                int tmp = a[i];
                a[i] = a[maxPos];
                a[maxPos] = tmp;
            }
        }
        return a;
    }

    private static int selectMax(int[] a, int left, int right) {
        int maxPos = left;
        int i = left;
        while (++i <= right) {
            if (a[i] > a[maxPos]) {
                maxPos = i;
            }
        }
        return maxPos;
    }
}
