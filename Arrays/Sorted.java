package Arrays;

import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean sorted = false;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i + 1]) {
                sorted = true;

            }
        }
        if (sorted) {
            System.out.print("Its sorted");
        }
        if (!sorted) {
            System.out.print("not sorted");
        }

    }
}
