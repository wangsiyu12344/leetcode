package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 763. 划分字母区间
 * 字符串 S 由小写字母组成。我们要把这个字符串划分为尽可能多的片段，
 * 同一个字母只会出现在其中的一个片段。返回一个表示每个字符串片段的长度的列表。
 */
public class PartitionLabels {
    public List<Integer> partitionLabels (String S){
        int[] last = new int[26];
        for(int i = 0; i < S.length(); i++){
            last[S.charAt(i) - 'a'] = i;
        }

        List<Integer> res = new ArrayList<>();
        int j = 0;
        int anchor = 0;
        for (int i = 0; i < S.length(); i++) {
            j = Math.max(j, last[S.charAt(i) - 'a']);
            if(i == j){
                res.add(j - anchor + 1);
                anchor = j + 1;
            }
        }
        return res;
    }

}
