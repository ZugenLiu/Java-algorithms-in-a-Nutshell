package searching;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinarySearchTest {

    @Test
    public void testSearchMethod() {

        Integer[] a = {1, 4, 8, 9, 11, 15, 17};
        assertTrue(new BinarySearch<Integer>().search(a, 11));
        assertFalse(new BinarySearch<Integer>().search(a, 100));

    }

}
