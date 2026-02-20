package Leetcode;

import java.util.Arrays;

public class GroupAnagrams {
    static void Anagrams(String[] strs){
        for (int i = 0; i < strs.length; i++) {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            for (int j = 0; j < sorted.length(); j++) {
                
            }
        }
    }
}
