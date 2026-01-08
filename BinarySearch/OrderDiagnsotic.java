package BinarySearch;

import java.util.Scanner;

public class OrderDiagnsotic {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter your target:");
        int target = sc.nextInt();

        
    }
    static void findOrder(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            System.out.println("Its in ascending order");

            int mid = start + (end - start)/2;

            if ( target > arr[mid]) {
                start = mid + 1;
            }else if ( target < arr[mid]) {
                end = mid - 1;
            }
            else{
                System.out.println("Your searched element found at the index number of:" + arr[mid]);
            }
        }

        System.out.println("Element doesn't found.");


        while (start > end) {
            System.out.println("Its in descending order");
            
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                start = mid + 1;
            }else if (target > arr[mid]) {
                end = mid - 1;
            }
            else{
                System.out.println("Your searched element found at the index number of:" + arr[mid]);
            }
        }

        System.out.println("Element doesn't found.");
    }
}
