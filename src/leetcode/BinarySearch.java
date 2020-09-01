package leetcode;

/**
 * 二分查找，返回要查找数的索引。
 */

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(binarySearch(arr,0,arr.length-1,2));
    }

    public static int binarySearch(int[] arr, int left, int right, int findVal) {
        if (left > right) return -1;
        int mid = (left + right) / 2;
        if(arr[mid] > findVal){
            return binarySearch(arr,left,mid-1,findVal);
        }else if(arr[mid] < findVal){
            return binarySearch(arr,mid+1,right,findVal);
        }else{
            return mid;
        }


    }
}
