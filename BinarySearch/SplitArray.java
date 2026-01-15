package BinarySearch;

public class SplitArray {
    public static void main(String[] args) {
        
    }
    public int SplitArray(int[] arr, int m){
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, arr[i]);
            end += arr[i];
        }

        while (start < end) {
            int mid = 
        }

        return end;
    }
}
