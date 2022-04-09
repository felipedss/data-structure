package leetcode;

import leetcode.linkedlist.MergeTwoLists;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNull;

public class MergeTwoListsTest {

    @Test
    public void test() {
        MergeTwoLists.ListNode result = new MergeTwoLists.ListNode(1,
                new MergeTwoLists.ListNode(1,
                        new MergeTwoLists.ListNode(2,
                                new MergeTwoLists.ListNode(3,
                                        new MergeTwoLists.ListNode(4,
                                                new MergeTwoLists.ListNode(4))))));

        MergeTwoLists.ListNode listNode = MergeTwoLists.mergeTwoLists(getFirstNode(), getSecondNode());
        assertEquals(result.val, listNode.val);
        assertEquals(result.next.val, listNode.next.val);
        assertEquals(result.next.next.val, listNode.next.next.val);
        assertEquals(result.next.next.next.val, listNode.next.next.next.val);
        assertEquals(result.next.next.next.next.val, listNode.next.next.next.next.val);
        assertNull(MergeTwoLists.mergeTwoLists(null, null));
    }

    private MergeTwoLists.ListNode getSecondNode() {
        MergeTwoLists.ListNode four1 = new MergeTwoLists.ListNode(4);
        MergeTwoLists.ListNode three = new MergeTwoLists.ListNode(3, four1);
        return new MergeTwoLists.ListNode(1, three);
    }

    private MergeTwoLists.ListNode getFirstNode() {
        MergeTwoLists.ListNode four = new MergeTwoLists.ListNode(4);
        MergeTwoLists.ListNode two = new MergeTwoLists.ListNode(2, four);
        return new MergeTwoLists.ListNode(1, two);
    }

}
