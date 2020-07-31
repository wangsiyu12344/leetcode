package leetcode;

/**
 * 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串。
 *
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被计为是不同的子串。
 *
 */
public class PalindromicSubstringsSolution1{
    //共有2N-1个可能的回文中心，依次遍历检查。从中间往外。
    public int countSubstrings(String s) {
        int N = s.length();
        int ans = 0;
        for(int i = 0; i<2*N-1; i++){
            int left = i/2;
            int right = left + i%2;
            while(left >= 0 && right < N && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
                ans++;
            }
        }
        return ans;
    }
}
