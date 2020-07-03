package leetcode;

/**
 * 538. 把二叉树转化为累加树
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，
 * 使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 * 使用了反向的中序遍历。
 */
public class ConvertBSTtoGreaterTree {

    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root == null) return root;
        greaterTree(root);
        return root;
    }

    public void greaterTree(TreeNode root){
        if(root == null) return;

        greaterTree(root.right);
        sum += root.val;
        root.val = sum;
        greaterTree(root.left);
    }

    class TreeNode{
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
