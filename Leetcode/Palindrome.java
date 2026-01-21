package Leetcode;

public class Palindrome {
    public static void main(String[] args) {
        String letter = "madad";
        char[] array = letter.toCharArray();
        Palindrome(array);
    }

    static int Palindrome(char[] arr) {
        boolean pali = true;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - 1 - i]) {
                pali = false;
            }
        }
        if (pali) {
            System.out.println("Its palindrome");
        }else{
            System.out.println("Its not a Plaindrome");
        }
        return -1;
    }

}
