package Leetcode;

public class FindMinHARD {
    public static void main(String[] args) {
        int[] arr = {3,3,1,3};
        int ans = Search(arr);
        System.out.println(ans);
    }

    static int Search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
        
            if (arr[end] <= arr[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
}
