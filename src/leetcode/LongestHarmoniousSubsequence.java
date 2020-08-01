package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 和谐数组是指一个数组里元素的最大值和最小值之间的差别正好是1。
 *
 * 现在，给定一个整数数组，你需要在所有可能的子序列中找到最长的和谐子序列的长度。
 * 使用一个HashMap来记录每个数字出现的次数。
 */
public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else{
                map.put(nums[i], 1);
            }
        }
        for(int i = 0; i<nums.length; i++){
            if(map.get(nums[i]+1) != null){
                res = Math.max(map.get(nums[i]+1) + map.get(nums[i]), res);
            }
        }

        return res;
    }
}
