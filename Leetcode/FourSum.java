package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    static ArrayList<Integer> sort(int[] arr, int target){
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int left = j + 1;
                int right = arr.length - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] + left + right;

                    if (sum < target) {
                        left ++;
                    }else{
                        right --;
                    }
                }
            }
        }
    }
}
