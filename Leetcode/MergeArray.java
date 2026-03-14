// https://leetcode.com/problems/merge-sorted-array/description/

package Leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {0};
        int[] arr2 = {2,5,6};
        ArrayList<Integer> ans =  Sorted(arr1, arr2, 0, 0);
        System.out.println(ans);
    }
    static ArrayList<Integer> Sorted(int[] arr1, int[] arr2, int m, int n){
        ArrayList<Integer>Merged = new ArrayList<>();
        m = 0;
        n = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0) {
                Merged.add(arr1[i]);
                m++;
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            if (arr2[j] > 0) {
                Merged.add(arr2[j]);
                n++;
            }
        }

        Collections.sort(Merged);
        return Merged;
    }
}
