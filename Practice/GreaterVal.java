package Practice;

import java.util.Scanner;

public class GreaterVal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = takeEle();
        FindEle(arr);
    }
    static int[] takeEle() {
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void FindEle(int arr[]){
        System.out.println("Enter the number: ");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) {
                System.out.println("Greater than your enter number: " + arr[i]);
            }
        }
    }
}
