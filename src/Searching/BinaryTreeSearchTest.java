package searching;


import org.junit.Test;
import searching.trees.Tree;
import searching.trees.UnbalancedBinaryTree;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BinaryTreeSearchTest {
    @Test
    public void testSearchMethod() {
        Tree tree = new UnbalancedBinaryTree<Integer>();
        Integer[] a = {13, 26, 43, 17, 25, 15, 16};
        for (int elem : a) {
            tree.insert(elem);
        }

        assertTrue(tree.search(17) != null);
        tree.remove(17);
        assertFalse(tree.search(17) != null);
        assertFalse(tree.search(100) != null);
        tree.insert(100);
        assertTrue(tree.search(100) != null);

    }
}
