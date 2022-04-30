package leetcode.dynamicprogramming;

import org.testng.Assert;
import org.testng.annotations.Test;

import static leetcode.dynamicprogramming.ClimbingStairs.climbStairs;

public class ClimbingStairsTest {

    @Test
    public void test() {
        Assert.assertEquals(2, climbStairs(2));
        Assert.assertEquals(3, climbStairs(3));
        Assert.assertEquals(5, climbStairs(4));
        Assert.assertEquals(1836311903, climbStairs(45));
    }
}
