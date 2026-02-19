package Leetcode;

public class SplitArray {
    public static void main(String[] args) {
        int[] arr =  {1,4,4,};
        int m = 2;
        int result = SplitArray(arr, m);
        System.out.println(result);
    }
    static int SplitArray(int[] arr, int m){
        int start = 0, end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int mid = start + (end - start)/2;
            
            int sum = 0;
            int pices = 1;

            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] > mid) {
                    sum = arr[i];
                    pices++;
                }else{
                    sum += arr[i];
                }
            }

            if (pices <= m) {
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
}
