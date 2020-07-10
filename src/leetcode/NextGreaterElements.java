package leetcode;
/**
 * 503. 下一个更大元素 II
 * 给定一个循环数组（最后一个元素的下一个元素是数组的第一个元素），
 * 输出每个元素的下一个更大元素。数字 x 的下一个更大的元素是按数组遍历顺序，
 * 这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。
 * 如果不存在，则输出 -1。
 *
 * 作法：从右往左，遍历两次。
 */

import java.util.Stack;

public class NextGreaterElements {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[nums.length];

        for(int i = 2*nums.length - 1; i>=0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i%nums.length]){
                stack.pop();
            }
            arr[i%nums.length] = stack.isEmpty()? -1 : nums[stack.peek()];
            stack.push(i%nums.length);
        }
        return arr;
    }

}
