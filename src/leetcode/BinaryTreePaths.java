package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * leetcode 257. 二叉树的所有路径
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 * 实例：输出: ["1->2->5", "1->3"]
 */
public class BinaryTreePaths {
    List<String> list = new ArrayList<>();

    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return list;
        helper(root, "");
        return list;

    }

    public void helper(TreeNode node, String s) {
        if (node == null) return;

        s += node.val;
        if (node.left == null && node.right == null) {
            list.add(s);

        } else {
            s += "->";
        }
        helper(node.left, s);
        helper(node.right, s);


    }

    class TreeNode{

      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

    }
}
