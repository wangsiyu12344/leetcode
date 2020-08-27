package leetcode;

/**
 * 665.
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
