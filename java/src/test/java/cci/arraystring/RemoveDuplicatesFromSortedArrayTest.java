package cci.arraystring;

import org.testng.annotations.Test;

import static leetcode.array.RemoveDuplicatesFromSortedArray.removeDuplicates;
import static org.testng.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {


    @Test
    public void test() {
        assertEquals(5, removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        assertEquals(2, removeDuplicates(new int[]{1, 1, 2}));
    }


}
