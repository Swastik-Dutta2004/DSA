package Leetcode;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {90, 80, 70,60,70,80};
        int target = 70;
        int last = peak(arr);
        int result = FindEle(arr, target, 0 ,last);
        if (result == -1) {
            result = FindEle(arr, target, last + 1, arr.length - 1);
        }

        if (result!= 0) {
            System.out.println("Target found at index No.: " + result);
        }else{
            System.out.println("Target not found ");
        }
    }
    static int peak(int[] arr){
        int start = 0, end = arr.length - 1;
        
        while (start < end) {
            int mid = start + (end - start)/ 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }
    
    static int FindEle(int[] arr, int target, int start, int end){
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start)/ 2;

            if(arr[mid] == target){
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if (arr[mid] > target) {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
