package BinarySearch;

import java.util.Scanner;

public class RotateBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value you want to find: ");
        int target = sc.nextInt();

        int result = ans(arr, target);

        if (result != -1) {
            System.out.print("Target found at index: " + result);
        } else {
            System.out.print("Target not found");
        }
    }

    static int ans(int[] arr, int target) {
        int pivot = RotatedArray(arr);

        if (pivot == -1) {
            return BinarySch(arr, target, 0, arr.length - 1);
        }
        if (arr[pivot] == target) {
            return pivot;
        }
        if (arr[0] > target) {
            return BinarySch(arr, target, pivot + 1, arr.length - 1);
        }
        if (arr[0] < target) {
            return BinarySch(arr, target, 0, pivot + 1);
        }
        return -1;
    }

    static int BinarySch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                System.out.println("Your searched element has found in the index of :   " + mid);

            }
            System.out.println("Element not found");
        }
        return -1;
    }

    static int RotatedArray(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[start] > arr[mid]) {
                return end = mid - 1;
            } else if (arr[start] < arr[mid]) {
                return start = mid + 1;
            }
        }
        return -1;
    }
}
