package leetcode.tree.binarytree;

import leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 94.  https://leetcode.com/problems/binary-tree-inorder-traversal/
 * 145. https://leetcode.com/problems/binary-tree-postorder-traversal/
 * 144. https://leetcode.com/problems/binary-tree-preorder-traversal/
 */
public class BinaryTreeTraversal {

    public static List<Integer> inOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>(inOrderTraversal(root.left));
        list.add(root.val);
        list.addAll(inOrderTraversal(root.right));
        return list;
    }

    public static List<Integer> postOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>(postOrderTraversal(root.left));
        list.addAll(postOrderTraversal(root.right));
        list.add(root.val);
        return list;
    }

    public static List<Integer> preOrderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(preOrderTraversal(root.left));
        list.addAll(preOrderTraversal(root.right));
        return list;
    }
}
