package leetcode;

/**
 * 110. 平衡二叉树
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。
 * 如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 * 我的做法：时间复杂度O(NlogN),
 *         空间复杂度最大O(N)
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        boolean flag = true;
        if(root == null) return true;
        int left = subtreeDepth(root.left);  //求出左子树的深度
        int right = subtreeDepth(root.right); //求出右子树的深度
        if(Math.abs(left - right) >1 ){  //如果左右子树的深度相差超过1，则设置flag为false;
            flag = false;
        }
        return isBalanced(root.left)&&isBalanced(root.right)&&flag;

    }
    //求子树高度的方法
    public int subtreeDepth(TreeNode root){
        if(root == null) return 0;
        return Math.max(subtreeDepth(root.left), subtreeDepth(root.right)) + 1;
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
