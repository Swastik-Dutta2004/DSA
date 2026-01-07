package LinerSearch;

import java.util.Scanner;

public class FindCha {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String str = sc.next();

        System.out.print("Enter the char you want to find: " );
        char target = sc.next().charAt(0);

        boolean result = FindChar(str, target);

        if (result) {
            System.out.println("Target Char is present in the string");
        }
        else {
            System.out.println("Target Char is not present in the string");
        }
    }
    static boolean FindChar(String str, char target){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
