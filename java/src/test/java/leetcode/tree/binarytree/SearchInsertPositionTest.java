package leetcode.tree.binarytree;

import org.testng.annotations.Test;

import static leetcode.tree.binarysearch.SearchInsertPosition.searchInsert;
import static org.testng.Assert.assertEquals;

public class SearchInsertPositionTest {

    @Test
    public void test() {
        assertEquals(1, searchInsert(new int[]{1, 2, 3, 4, 5, 6, 8}, 2));
        assertEquals(4, searchInsert(new int[]{1, 2, 3, 4, 5, 6, 8}, 5));
        assertEquals(0, searchInsert(new int[]{1, 2, 3, 4, 5, 6, 8}, 0));
        assertEquals(6, searchInsert(new int[]{1, 2, 3, 4, 5, 6, 8}, 8));
        assertEquals(6, searchInsert(new int[]{1, 2, 3, 4, 5, 6, 8}, 7));
        assertEquals(2, searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(4, searchInsert(new int[]{1, 3, 5, 6}, 7));
        assertEquals(0, searchInsert(new int[]{1, 3, 5, 6}, 1));
        assertEquals(1, searchInsert(new int[]{1, 3}, 2));
        assertEquals(2, searchInsert(new int[]{1, 3, 5}, 4));
        assertEquals(1, searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
}
