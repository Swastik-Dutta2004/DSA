package Arrays;

import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int positive = 0;
        int negative = 0;
        int Zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            }
            if (arr[i] < 0) {
                negative++;
            }
            if (arr[i] == 0) {
                Zero++;
            }
        }

        if (positive > 0) {
            System.out.println("Number of Positive: " + positive);
        }
        if (negative > 0) {
            System.out.println("Number of Negative: " + negative);
        }
        if (Zero > 0) {
            System.out.println("Number of zero: " + Zero);
        }
    }

}
