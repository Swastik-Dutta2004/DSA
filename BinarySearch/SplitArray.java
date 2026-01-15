package BinarySearch;

import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number of max splir you want to do: ");
        int m = sc.nextInt();

        int ans = SplitArray(arr, m);
        System.out.println(ans);
    }

    static int SplitArray(int[] arr, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = Math.max(start, i);
            end += arr[i];
        }

        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int pices = 1;

            for (int i = 0; i < arr.length; i++) {
                if (sum + arr[i] > mid) {
                    sum = arr[i];
                    pices++;
                } else {
                    sum += arr[i];
                }
            }

            if (pices <= m) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return end;
    }
}
