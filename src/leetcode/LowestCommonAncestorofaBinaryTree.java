package leetcode;

/**
 * 236. 二叉树的最近公共祖先
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 递归思路，后序遍历思想
 * 时间复杂度：O(n)
 * 空间复杂度:O(n)，最坏情况下考虑它是一个一条链。
 */
public class LowestCommonAncestorofaBinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;
        TreeNode leftres = lowestCommonAncestor(root.left, p , q);
        TreeNode rightres = lowestCommonAncestor(root.right, p , q);
        if(leftres == null){
            return rightres;
        }else if(rightres == null){
            return leftres;
        }else{
            return root;
        }
    }
    class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

}
