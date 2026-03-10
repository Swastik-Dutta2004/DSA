// https://leetcode.com/problems/set-mismatch/submissions/1930402592/

package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] result = CycleSort(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] CycleSort(int[] arr){
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

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(arr[index]);
                ans.add(index + 1);
            }
        }

        int[] list = new int[ans.size()];
        for (int j = 0; j < list.length; j++) {
            list[j] = ans.get(j);
        }
        return list;
    }

    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
