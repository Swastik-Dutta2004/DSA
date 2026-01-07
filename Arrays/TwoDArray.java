package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr [][] = new int[3][4];

        System.out.println("Enter 12 numbers:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing 2d Array:");
        for (int [] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
