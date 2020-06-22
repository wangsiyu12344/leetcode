package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * leetcode: 637. 二叉树的层平均值
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
 * 使用到BFS思想。
 */

public class AverageOfLevels {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();  //queue来记录每一层的节点
        queue.add(root);

        while(!queue.isEmpty()){  //新的一层
            long sum = 0;
            long count = 0;
            Queue<TreeNode> temp = new LinkedList<>();  //temp作为临时队列，存储当前层节点的子节点。

            while(!queue.isEmpty()){
                TreeNode current = queue.remove();
                sum += current.val;
                count++;
                if(current.left != null){
                    temp.add(current.left);
                }
                if(current.right != null){
                    temp.add(current.right);
                }
            }
            queue = temp;
            list.add(sum * 1.0 / count);
        }
        return list;
    }

    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}
