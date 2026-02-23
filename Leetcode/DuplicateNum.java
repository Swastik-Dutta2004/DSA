package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateNum {
    public static void main(String[] args) {
            int[] arr = {5,2,3,1,4};
            CycleSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    static void CycleSort(int[]arr){
        int i = 0;

        while (i < arr.length) {
            int currectIndex = arr[i] - 1;

            if (arr[i] != arr[currectIndex]) {
                Swap(arr, i, currectIndex);
            }else{
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != arr[arr[i]]) {
                 ans.add(arr[index] -1);
                index++;
            }
        }
    }
    
    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }   
}
