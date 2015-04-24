package searching;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HashSearchTest {

    @Test
    public void testSearchMethod() {


        HashSearch<Integer> hashSearcher = new HashSearch<Integer>();
        Iterator<Integer> iterator = new ArrayList<Integer>(Arrays.asList(1, 4, 8, 9, 11, 15, 17)).iterator();
        hashSearcher.load(iterator, 3);
        assertTrue(hashSearcher.search(11));
        assertFalse(hashSearcher.search(100));

    }

}
