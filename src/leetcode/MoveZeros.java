package leetcode;

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，
 * 同时保持非零元素的相对顺序。
 * 1.必须在原数组上操作，不能拷贝额外的数组。
 * 2.尽量减少操作次数
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int index= 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }
        if(index <= nums.length-1){
            for(int i = index; i<nums.length; i++){
                nums[i] = 0;
            }
        }
    }
}
