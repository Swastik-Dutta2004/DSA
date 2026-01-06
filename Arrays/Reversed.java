package Arrays;

import java.util.Scanner;

public class Reversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int starting = 0;
        int ending = arr.length - 1;

        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        while (starting < ending) {
            int temp = arr[starting];
            arr[starting] = arr[ending];
            arr[ending] = temp;
            
            starting ++;
            ending --;
        }

        System.out.print("Reveresed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
