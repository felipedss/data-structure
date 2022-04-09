package leetcode.linkedlist;

/**
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoLists {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }

        ListNode listNode = null;
        ListNode tail = null;
        while (list1 != null || list2 != null) {
            //If the value is null, receive a value greater than the second list for comparison
            int value1 = list1 == null ? list2.val + 1 : list1.val;
            int value2 = list2 == null ? list1.val + 1 : list2.val;

            //The value that will be inserted in the node is the smallest.
            ListNode node = new ListNode(Math.min(value1, value2));

            if (tail == null) {
                listNode = node;
            } else {
                tail.next = node; //tail.next is always current node
            }
            tail = node; //tail receives the node

            if ((value1 < value2 || value1 == value2) && list1 != null) {
                list1 = list1.next; //clear one position in the first node
            } else if (list2 != null) {
                list2 = list2.next; //clear one position in the second node
            }
        }
        return listNode;

    }
}
