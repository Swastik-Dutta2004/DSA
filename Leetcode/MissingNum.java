//1. https://leetcode.com/problems/missing-number/description/
//2. https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1 };
        MissingNum(arr);
        ArrayList<Integer> result = FindVal(arr);
        System.out.println(result);
    }

    static void MissingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int currectIndex = arr[i] -1;
            
            if (arr[i] != arr[currectIndex]) {
                swap(arr, i, currectIndex);

            } else {
                i++;
            }
        }
    }

     static ArrayList<Integer> FindVal(int[] arr) {
        ArrayList<Integer> ans  = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
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
