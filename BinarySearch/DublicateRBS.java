package BinarySearch;

import java.util.Scanner;

public class DublicateRBS {

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
        int pivot = DuplicatedRotatedArray(arr, target);

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

    static int DuplicatedRotatedArray(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // duplicates case
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                start++;
                end--;
            } else if (arr[start] <= arr[mid]) {
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;

    }
}
