package BinarySearch;

import java.util.Scanner;

public class Floor {
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

        Floor(arr, target);

    }
    static void Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (arr[mid] < target) {
                ans = arr[mid];
                start = mid + 1;
            }else if (arr[mid] > target){
                end = mid - 1;
            }else{
                if (target == ) {
                    
                }
            }
        }
            if (ans != 0) {
                System.out.println("Nearest largest element than " + target + " is " + ans);
            } else {
                System.out.println("There is no element greater than " + target);
            }
    }
}
