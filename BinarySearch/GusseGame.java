package BinarySearch;

import java.util.Scanner;

public class GusseGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value you want to find: ");
        int target = sc.nextInt();

        GusseNumber(arr, target);

    }
    static int GusseNumber(int[] arr, int pick){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (pick < arr[mid]) {
                end = mid;
            }else if (pick > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }   
        return -1;
    }
}
