package hashtable;

import java.util.Hashtable;
import java.util.Map;

/*
https://leetcode.com/problems/contains-duplicate/
*/
public class ContainsDuplicate {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new Hashtable<>();
        for (int num : nums) {
            if (map.get(num) == null) {
                map.put(num, 1);
            } else {
                return true;
            }
        }
        return false;
    }
}
