package Leetcode;

import java.util.Arrays;

public class kthLargestEle {
    public static void main(String[] args) {
        int[] arr = {3,2,3,1,2,4,5,5,6};
        int ans = LargestEle(arr, 2);
        System.out.println(ans);
    }
    static int LargestEle(int[] arr, int k){
        Arrays.sort(arr);
        return arr[arr.length - k];
    }
}
