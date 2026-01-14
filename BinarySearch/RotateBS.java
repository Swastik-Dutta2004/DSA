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

        System.out.print("Enter the target: ");
        int target = sc.nextInt();

        int pivot = RotatedArray(arr, target);

        System.out.println("So the pivot is in index number: " + pivot + "");
    }
    static int RotatedArray(int[] arr, int target){
        int start = 0, end = arr.length - 1 ;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }else if (arr[start] > arr [mid]) {
                return end = mid - 1;
            }else if (arr[start] < arr [mid]) {
                return start = mid + 1;
            }
        }
        return -1;
    }
}
