package leetcode;

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
