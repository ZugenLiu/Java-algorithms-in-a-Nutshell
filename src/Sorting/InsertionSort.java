package Sorting;


import java.util.Arrays;

public class InsertionSort {

    public static int[] sort(int[] a) {

        for (int i = 1; i < a.length; i++) {
            insert(a, i, a[i]);
            System.out.println(Arrays.toString(a));
        }
        return a;
    }

    private static void insert(int[] a, int pos, int value) {
        int i = pos - 1;
        while (i >= 0 && a[i] > value) {
            a[i + 1] = a[i];
            i--;
        }
        a[i + 1] = value;

    }


}

