package BinarySearch;

import java.util.Scanner;

public class InfiniteArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers of elements you want: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = sc.nextInt();

        int index = ans(arr, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
    }

    static int ans(int[] arr, int target ) {
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            start = end + 1;
            end = start + (end - start + 1)/2;
        }
        return BinarySearch(arr, target, start, end);
        
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
