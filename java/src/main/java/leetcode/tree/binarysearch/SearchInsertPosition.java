package leetcode.tree.binarysearch;

/**
 * 35. https://leetcode.com/problems/search-insert-position
 */
public class SearchInsertPosition {

    public static int searchInsert(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == x) {
                return mid;
            } else if (x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }


}
