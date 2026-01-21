package Leetcode;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target: ");
        int target = sc.nextInt();

        Sum(arr, target);

    }
    static int Sum(int[] arr, int target){
        int first = 0;
        int second = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int total = arr[i] + arr[j];

                if (total == target) {
                    first = arr[i];
                    second = arr[j];
                }
            }
        }
        System.out.println("First element is: " + first+ " second element is: "+ second);
        return -1;
    }
}
