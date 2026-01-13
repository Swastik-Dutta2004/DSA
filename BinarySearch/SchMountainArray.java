package BinarySearch;

import java.util.Scanner;

public class SchMountainArray {

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

        int peak = peakElement(arr);
        int firstPart = OrderAgnostic(arr, target, 0, peak);

        if (firstPart == -1) {
            System.out.println("Target found at index: " + firstPart);
        } else {
            System.out.println("Target not found");
        }


    }

    static int OrderAgnostic(int[] arr, int target, int start, int end) {
        
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Your target element is in " + mid + " number index.");
                
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
