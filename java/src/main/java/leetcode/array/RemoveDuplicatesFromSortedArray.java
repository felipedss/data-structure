package leetcode.array;

/**
 * 26. https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int position = 0;
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] != nums[position]) {
                position++;
                nums[position] = nums[index];
            }
        }
        return position + 1;
    }

}
