package BinarySearch;

import java.util.Scanner;

public class BinarySch {

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

        SearchEle(arr, target);

    }

    static void SearchEle(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
               start = mid + 1; 
            }
            else if (arr[mid] > target) {
                end =  mid - 1;
            }
            else{
                System.out.println("Your searched element has found in the index of :   " + mid);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
