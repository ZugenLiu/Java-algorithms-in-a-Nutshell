package sorting;


import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountingSortTest {

    @Test
    public void testSortMethod() {

        int[] a = {3, 0, 3, 0, 0, 2, 2};
        a = CountingSort.sort(a, 4);
        final int[] waitedResult = {0, 0, 0, 2, 2, 3, 3};
        assertArrayEquals(waitedResult, a);

    }

    @Test
    public void testSecondSortMethod() {

        int[] a = {6, 5, 4, 7, 4, 5, 10};
        a = CountingSort.sortIntegersFromRange(a, 4, 10);
        final int[] waitedResult = {4, 4, 5, 5, 6, 7, 10};
        assertArrayEquals(waitedResult, a);

    }
}
