package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 565. 数组嵌套
 * 索引从0开始长度为N的数组A，包含0到N - 1的所有整数。找到最大的集合S并返回其大小，其中 S[i] = {A[i], A[A[i]], A[A[A[i]]], ... }且遵守以下的规则。
 *
 * 假设选择索引为i的元素A[i]为S的第一个元素，S的下一个元素应该是A[A[i]]，之后是A[A[A[i]]]... 以此类推，不断添加直到S出现重复的元素
 *
 */
public class ArrayNesting {
    public int arrayNesting(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< nums.length ; i++){
            int count = 0, k = i;
            while(!set.contains(nums[k])){
                set.add(nums[k]);
                count++;
                k = nums[k];
            }
            res = Math.max(count, res);
        }
        return res;
    }
}
