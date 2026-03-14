package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class FourSum {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        ArrayList<ArrayList<Integer>> ans = sort(arr, 8);
        System.out.println(ans);
    }
    static ArrayList<ArrayList<Integer>> sort(int[] arr, int target){

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length - 3; i++) {
            if(i > 0 && arr[i] == arr[i-1]) continue;

            for (int j = i + 1; j < arr.length - 2; j++) {
                 if(j > i+1 && arr[j] == arr[j-1]) continue;
                 
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
                        while(left < right && arr[left] == arr[left-1]) left++;
                        while(left < right && arr[right] == arr[right+1]) right--;
                        
                    }
                }
            }
        }

        return result;
    }
}
