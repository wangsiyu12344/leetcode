package leetcode;

/**
 *给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 *
 *具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 * dynamic programming
 */
public class PalindromicSubstringsSolution2 {
    public int countSubstrings(String s) {
        int len = s.length();
        boolean [][]dp = new boolean [len][len];
        int res = 0;
        for(int i =0; i<len; i++){
            dp[i][i] = true;
            res++;
        }
        for(int i = len-1; i>=0; i--){
            for(int j=i+1; j<len; j++){
                if(s.charAt(i) == s.charAt(j)){
                    if(j-i == 1){
                        dp[i][j] = true;
                    }else{
                        dp[i][j] = dp[i+1][j-1]; //从字符串中心往外。
                    }
                }else{
                    dp[i][j] = false;
                }
                if(dp[i][j]){
                    res++;
                }
            }
        }
        return res;
    }
}
