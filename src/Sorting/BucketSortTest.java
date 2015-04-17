package Sorting;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class BucketSortTest {

    @Test
    public void testSortMethod() {

        int[] a = {7, 5, 13, 2, 14, 1, 6};
        a = BucketSort.sort(a, 4);
        final int[] waitedResult = {1, 2, 5, 6, 7, 13, 14};
        assertArrayEquals(waitedResult, a);

    }
}
