package Sorting;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SelectionSortTest {

    @Test
    public void testSortMethod() {


        int[] a = {15, 9, 8, 1, 4, 11, 7, 12, 13, 6, 5, 3, 16, 2, 10, 14};
        a = SelectionSort.sort(a);
        final int[] waitedResult = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        assertArrayEquals(waitedResult, a);

    }
}
