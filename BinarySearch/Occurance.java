package BinarySearch;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        FirstOccu(arr, target);
        LastOccu(arr, target);
    }
    static void FirstOccu(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                ans = mid;
                end = mid - 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;

            }
        }
        System.out.println(target + " first occurance is: " + ans);
    }

    static void LastOccu(int[] arr, int target){
        int start = 0, end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target == arr[mid]) {
                ans = mid;
                start = mid + 1;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;

            }
        }
        System.out.println(target + " last occurance is: " + ans);
    }
}
