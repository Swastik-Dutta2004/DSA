package Leetcode;

import java.util.Arrays;

public class LargestNum {
    public static void main(String[] args) {
        int[] arr = { 3, 30, 34, 5, 9 };
        String result = stringConversion(arr);
        System.out.println(result);
    }
 
    static String stringConversion(int[] arr) {
        String[] str = new String[arr.length];

        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(str, (a,b) -> (b + a).compareTo(a + b));
        
        if(str[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }

        return sb.toString();
    }

}
