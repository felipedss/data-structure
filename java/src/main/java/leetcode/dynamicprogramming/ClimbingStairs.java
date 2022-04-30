package leetcode.dynamicprogramming;

/**
 * 70. https://leetcode.com/problems/climbing-stairs/
 */
public class ClimbingStairs {

    public static int climbStairs(int n) {
        return climbStairs(n, new int[n + 1]);
    }

    private static int climbStairs(int n, int[] memo) {
        if (n == 0 || n == 1 || n == 2) return n;
        if (memo[n] == 0) {
            memo[n] = climbStairs(n - 1, memo) + climbStairs(n - 2, memo);
        }
        return memo[n];
    }


}
