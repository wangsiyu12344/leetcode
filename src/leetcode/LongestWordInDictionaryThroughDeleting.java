package leetcode;

import java.util.List;

/**
 * 524. 通过删除字母匹配到字典里最长单词
 * 给定一个字符串和一个字符串字典，找到字典里面最长的字符串，
 * 该字符串可以通过删除给定字符串的某些字符来得到。如果答案不止一个，
 * 返回长度最长且字典顺序最小的字符串。如果答案不存在，则返回空字符串。
 */
public class LongestWordInDictionaryThroughDeleting {
    public String findLongestWord(String s, List<String> d) {
        int i = 0, j = 0;
        String res = "";
        for(String str : d){
            while(i < s.length() && j < str.length() ){
                if(s.charAt(i) == str.charAt(j)){
                    i++;
                    j++;
                }else{
                    i++;
                }
            }
            if(j == str.length()){
                if(j > res.length()){
                    res = str;
                }else if(j == res.length() && str.compareTo(res) < 0){
                    res = str;
                }
            }
            i = 0;
            j = 0;
        }
        return res;

    }
}
