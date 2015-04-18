package Searching;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SequentialSearchTest {

    @Test
    public void testSearchMethod() {

        Integer[] a = {1, 4, 8, 9, 11, 15, 17, 22, 23, 26};
        assertTrue(new SequentialSearch<Integer>().sequentialSearch(a, 15));
        assertFalse(new SequentialSearch<Integer>().sequentialSearch(a, 100));

    }

    @Test
    public void testSecondSortMethod() {

        ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1, 4, 8, 9, 11, 15, 17, 22, 23, 26));
        assertTrue(new SequentialSearch<Integer>().sequentialSearch(ar, 15));
        assertFalse(new SequentialSearch<Integer>().sequentialSearch(ar, 100));

    }
}
