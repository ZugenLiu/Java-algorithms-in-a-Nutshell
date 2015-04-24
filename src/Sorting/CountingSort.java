package sorting;


public class CountingSort {

    /*Sort the n elements in ar, drawn from the values [0,k). */
    public static int[] sort(int[] a, int k) {

        int[] B = new int[k];

        for (int number : a) {
            B[number]++;
        }

        int idx = 0;

        for (int i = 0; i < k; i++) {
            while (B[i]-- > 0) {
                a[idx++] = i;
            }
        }
        return a;
    }

    /* Sort the n elements in ar, drawn from the values [min, max). */
    public static int[] sortIntegersFromRange(int[] a, int min, int max) {
        int[] B = new int[max - min + 1];

        for (int number : a) {
            B[number - min]++;
        }

        int idx = 0;
        for (int i = min; i <= max; i++) {
            while (B[i - min]-- > 0) {
                a[idx++] = i;
            }
        }
        return a;
    }
}
