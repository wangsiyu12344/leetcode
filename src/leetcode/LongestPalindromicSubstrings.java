package leetcode;

/**
 * 5.最长子回文串
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。
 */
public class LongestPalindromicSubstrings {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return s;
        int len = s.length();
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i <= 2*len-1; i++ ){
            int left  = i/2;
            int right = left + i%2;
            while(left >= 0 && right <= (len-1) && s.charAt(left)==s.charAt(right)){
                if(sb.length() < right-left+1){
                    sb = new StringBuilder(s.substring(left, right+1));
                }
                left--;
                right++;
            }
        }
        return sb.toString();
    }
}
