package Sorting;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    @Test
    public void testConcatenate() {


        int[] a = {1, 4, 8, 9, 11, 15, 7, 12, 13, 6};
        a = InsertionSort.sort(a);
        final int[] waitedResult = {1, 4, 6, 7, 8, 9, 11, 12, 13, 15};
        assertArrayEquals(waitedResult, a);

    }
}
