package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {1,0,-1,0,-2,2};
        ArrayList<ArrayList<Integer>> ans = sort(arr, 0);
        System.out.println(ans);
    }
    static ArrayList<ArrayList<Integer>> sort(int[] arr, int target){

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            for (int j = i + 1; j < arr.length - 2; j++) {
                int left = j + 1;
                int right = arr.length - 1;

                while (left < right) {
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];

                    if (sum < target) {
                        left ++;
                    }else if(sum > target){
                        right --;
                    }else{
                        ArrayList<Integer> temp = new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[left]);
                        temp.add(arr[right]);

                        result.add(temp);
                        left ++;
                        right --;
                        
                    }
                }
            }
        }

        return result;
    }
}
