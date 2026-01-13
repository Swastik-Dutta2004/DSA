package BinarySearch;

import java.util.Scanner;

public class MountainArray {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = MountainArray(arr);
        System.out.println("The largest element in the array is: " + ans);
    }
    static int MountainArray(int[] arr){
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
        return arr[end];
    }
}
