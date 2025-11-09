package lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the names: ");
        String arr [] = new String[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
            System.out.println(arr);
        }
    }


}
