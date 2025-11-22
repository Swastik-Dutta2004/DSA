package lecture13;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {
static Scanner sc = new Scanner(System.in);

public static void main(String[] args) {
    search();
}

    static void search(){
        int [][] arr = new int [3][4];
        System.out.print("Enter 12 numbers: ");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing 2d Array:");
        for (int [] a : arr) {
            System.out.println(Arrays.toString(a));
        }

        System.out.println("Enter the number you want to find: ");
        int target = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (target == arr[i][j]) {
                    System.out.println("Value found at index: (" + i + ", " + j + ")");
                }
            }
        }
    }
}
