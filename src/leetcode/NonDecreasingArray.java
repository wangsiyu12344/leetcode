package leetcode;

/**
 * 665. 非递减数列
 * 给你一个长度为 n 的整数数组，请你判断在 最多 改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 *
 * 我们是这样定义一个非递减数列的： 对于数组中所有的 i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。
 *
 */
public class NonDecreasingArray {
    public boolean nonDecreasingArray(int[] nums) {
        if (nums.length < 2) return true;
        int count = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i - 1] > nums[i]) {
                count++;
                if (count >= 2) return false;
                if (i - 2 >= 0 && nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else if (i - 2 >= 0 && nums[i - 2] > nums[i]) {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return true;
    }
}
