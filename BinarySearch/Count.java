package BinarySearch;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value you want to find: ");
        int target = sc.nextInt();

        firstOccurance(arr, target);
        // lastOccurance(arr, target);
        
    }
    static void firstOccurance(int[] arr, int target){
        int count = 0;
        int start = 0;
        int end = arr.length-1;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                count++;
                ans = mid;
                start = mid + 1;
            }else if (target < arr[mid]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        if (count > 0) {
            System.out.println("Your target value has appeared "+ count + " times.");
        } else{
            System.out.println("Element doesn't found.");
        }

    }

    // static void lastOccurance(int[] arr, int target){
    //     int count = 0;
    //     int start = 0;
    //     int end = arr.length-1;
    //     int ans = 0;

    //     while (start <= end) {
    //         int mid = start + (end - start)/2;

    //         if (target == arr[mid]) {
    //             count++;
    //             ans = mid;
    //             start = mid + 1;
    //         }else if (target < arr[mid]) {
    //             start = mid + 1;
    //         }else{
    //             end = mid - 1;
    //         }
    //     }
    //     if (count > 0) {
    //         System.out.println("Your target value has appeared "+ count + " times.");
    //     } else{
    //         System.out.println("Element doesn't found.");
    //     }

    // }
}
