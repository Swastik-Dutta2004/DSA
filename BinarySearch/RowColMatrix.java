package BinarySearch;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30,40},
            {12,23,33,43},
            {13,24,34,45},
            {15,25,35,45}
        };
        System.out.println(Arrays.toString(search(arr, 45)));
    }
    static int[] search(int[][] arr, int target){
        int r = 0;
        int c = arr.length - 1;
        while (r < arr.length && c >= 0) {
            if (target == arr[r][c]) {
                return new int[]{r,c};
            }
            if (target > arr[r][c]) {
                r ++;
            }else{
                c ++;
            }
        }
        return new int []{-1, -1};
    }
}
