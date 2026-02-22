// https://leetcode.com/problems/group-anagrams/description/

package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(Anagram(str));
    }

    static List<List<String>> Anagram(String[] str){
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            char[] arr = str[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str[i]);
        }

        return new ArrayList<>(map.values());
    }
}