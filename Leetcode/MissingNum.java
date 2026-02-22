// https://leetcode.com/problems/missing-number/description/

package Leetcode;

import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        MissingNum(arr);
        int result = FindVal(arr);
        System.out.println(result);
    }

    static void MissingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int currectIndex = arr[i];

            if (arr[i] < arr.length && arr[i] != arr[currectIndex]) {
                swap(arr, i, currectIndex);

            } else {
                i++;
            }
        }
    }

     static int FindVal(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                ans = i;
            }
        }
        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
