// https://leetcode.com/problems/first-missing-positive/

package Leetcode;

import java.util.ArrayList;

public class MissingPos {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        int result = CycleSort(arr);
        System.out.println(result);
    }

    static int CycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int currentIndex = arr[i] - 1;

            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[currentIndex]) {
                Swap(arr, i, currentIndex);
            } else {
                i++;
            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                    return j + 1;
            }
        }
        return arr.length + 1;
    }

    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    } 
}
