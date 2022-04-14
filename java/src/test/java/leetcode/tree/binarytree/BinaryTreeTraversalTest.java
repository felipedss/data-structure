package leetcode.tree.binarytree;

import leetcode.tree.TreeNode;
import org.testng.annotations.Test;

import java.util.Arrays;

import static leetcode.tree.binarytree.BinaryTreeTraversal.*;
import static org.testng.Assert.assertEquals;

public class BinaryTreeTraversalTest {

    @Test
    public void testInOrderTraversal() {
        TreeNode three = new TreeNode(3);
        TreeNode right = new TreeNode(2, three, null);
        TreeNode root = new TreeNode(1, null, right);
        assertEquals(Arrays.asList(1, 3, 2), inOrderTraversal(root));
    }

    @Test
    public void testPostOrderTraversal() {
        TreeNode three = new TreeNode(3);
        TreeNode right = new TreeNode(2, three, null);
        TreeNode root = new TreeNode(1, null, right);
        assertEquals(Arrays.asList(3, 2, 1), postOrderTraversal(root));
    }

    @Test
    public void testPreOrderTraversal() {
        TreeNode three = new TreeNode(3);
        TreeNode right = new TreeNode(2, three, null);
        TreeNode root = new TreeNode(1, null, right);
        assertEquals(Arrays.asList(1, 2, 3), preOrderTraversal(root));
    }

}
