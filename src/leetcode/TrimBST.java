package leetcode;

/**
 * 669. 修剪二叉搜索树
 * 给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，
 * 使得所有节点的值在[L, R]中 (R>=L) 。你可能需要改变树的根节点，
 * 所以结果应当返回修剪好的二叉搜索树的新的根节点。
 *

 */
public class TrimBST {

    public TreeNode trimBST(TreeNode root, int L, int R){
        if(root == null) return root;

        if(root.val < L) return trimBST(root.left, L ,R); //返回左边子树修剪的结果
        if(root.val > R) return trimBST(root.right, L ,R); //返回右边子树修剪的结果

        root.left = trimBST(root.left, L, R); //否则，如果(root.val >= L && root.val <= R)
                                                // 左子树等于左子树修剪后的结果
        root.right = trimBST(root.right, L, R); //右子树等于右子树修建后的结果
        //root检查过了，root.left修剪了，root.right修剪了， 那么此时整棵树都修建完了。
        return root;

    }
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
