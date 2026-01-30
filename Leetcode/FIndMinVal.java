package Leetcode;

public class FIndMinVal {
    public static void main(String[] args) {
        int[] arr = {7};
        int result = FindMin(arr);
        System.out.println(result);
    }
    static int FindMin(int[] arr){
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return arr[start];

    }
}
