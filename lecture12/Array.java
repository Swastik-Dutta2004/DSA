package lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        int arr [] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i] + "");
        }
        System.out.print("Enter the names: ");
        String name [] = new String[4];
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
            System.out.println(name[i]);
        }
    }


}
