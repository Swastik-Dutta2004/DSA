package Leetcode;

import java.util.Arrays;

public class FindDupli {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int result = CycleSort(arr);
        System.out.println(result);
    }
    static int CycleSort(int[] arr){
        int i = 0;
        int ans = 0;
        while (i < arr.length) {
            int currentIndex = arr[i] - 1;

            if (arr[i] != arr[currentIndex]) {
                Swap(arr, i, currentIndex);
            }else{
                i++;
            }
            ans = arr[arr.length -1];
        }
        return ans;
    }

    static void Swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
