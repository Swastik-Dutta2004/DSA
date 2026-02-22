// https://leetcode.com/problems/largest-number/submissions/1927239962/

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

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length; i++) {
            sb.append(str[i]);
        }

        return sb.toString();
    }

}
