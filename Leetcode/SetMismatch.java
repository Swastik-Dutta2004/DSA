package Leetcode;

import java.util.ArrayList;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        ArrayList<Integer> result = CycleSort(arr);
        System.out.println(result);
    }
    static ArrayList<Integer> CycleSort(int[] arr){
        int i = 0;

        while (i < arr.length) {
            int currentIndex = arr[i] - 1;

            if (arr[i] != arr[currentIndex]) {
                Swap(arr, i, currentIndex);
            }else{
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(arr[j]);
                ans.add(j+1);
            }
        }
        return ans;
    }

    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
