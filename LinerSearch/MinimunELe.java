package LinerSearch;

import java.util.Scanner;

public class MinimunELe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the elements of the array: ");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        
        FindMini(arr);
    }
    static void FindMini(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element present in the array is: "+ min);
    }
}
