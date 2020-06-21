package leetcode;

/**
 * leetcode : 543. 二叉树的直径
 * 给定一棵二叉树，你需要计算它的直径长度。
 * 一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过也可能不穿过根结点。
 *
 * 思路: 求出每一个节点的左子树和右子树的高度的最大值
 */
public class DiameterOfBinaryTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root){
        depth(root);
        return max;
    }

    //求出子树高度的方法,再比较
    public int depth(TreeNode node){
        if(node == null) return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        //求出最大值
        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;

    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
