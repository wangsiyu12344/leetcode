package leetcode;

/**
 * 667.优美的排列2
 *
 *给定两个整数 n 和 k，你需要实现一个数组，这个数组包含从 1 到 n 的 n 个不同整数，同时满足以下条件：
 *
 * ① 如果这个数组是 [a1, a2, a3, ... , an] ，那么数组 [|a1 - a2|, |a2 - a3|, |a3 - a4|, ... , |an-1 - an|] 中应该有且仅有 k 个不同整数；.
 *
 * ② 如果存在多种答案，你只需实现并返回其中任意一种.
 *
 */
public class BeautifulArrangementII {
    public int[] constructArray(int n, int k) {
        int[] res = new int[n];
        for(int i = 0; i < n; i++ ){
            res[i] = i+1;
        }
        if(k == 1) return res;
        for(int m = 1; m<k; m++){
            reverse(res, m, n-1);
        }

        return res;
    }

    public void reverse(int[]res, int start, int end){
        while(start < end){
            int temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;
            end--;
        }

    }
}
