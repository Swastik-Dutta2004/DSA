package Arrays;

import java.util.Scanner;

public class Duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean found = false;
        System.out.print("Dublicated values are: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    found = true;
                }
            }
            
        }
        if (!found) {
            System.out.println("Not found");
        }
    }
}
