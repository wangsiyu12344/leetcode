package leetcode;

/**
 * 687. 最长同值路径
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 */
public class LongestUnivaluePath {
    int ans = 0;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null) return 0;
        helper(root);
        return ans;

    }
    public int helper(TreeNode node){ //后序遍历。从下层遍历到到上层
        if(node == null) return 0;
        int left = helper(node.left);   //返回左节点现有的最长同值路径（值并不一定等于node的值）
        int right = helper(node.right); //返回右节点现有的最长同值路径（值并不一定等于node的值）
        if(node.left != null && node.left.val == node.val){
            left++; //左节点和现有的node连起来了。
        }else{
            left = 0; //左节点现有的最长同值路径的值不等于node的值，清零（无法连接起来)
        }
        if(node.right != null && node.right.val == node.val){
            right++;
        }else{
            right = 0; //右节点现有的最长同值路径的值不等于node的值，清零（无法连接起来)
        }
        ans = Math.max(ans, left + right); //现有的left + right能否替代ans
        return Math.max(left , right); //返回左和右更长的那一段给上层的node供它使用。

    }
    class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
    }
}
