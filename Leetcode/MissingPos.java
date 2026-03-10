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

            if (arr[i] != arr[currentIndex]) {
                Swap(arr, i, currentIndex);
            } else {
                i++;
            }
        }


        ArrayList<Integer> ans = new ArrayList<>(); 
        for (int j = 0; j <= arr.length; j++) {
            if (arr[j] > 0 ) {
                
            }
        }
        return -1;
    }

    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    } 
}
