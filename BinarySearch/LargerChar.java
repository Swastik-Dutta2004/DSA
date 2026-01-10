package BinarySearch;

import java.util.Scanner;

public class LargerChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the Characters: ");
        int n = sc.nextInt();

        char[] arr = new char[n];

        System.out.print("Enter the Characters: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next().charAt(0);
        }

        System.out.print("Enter the target value you want to find: ");
        char target = sc.next().charAt(0);

        FindChar(arr, target);
    }
    static void FindChar(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;
        char ans = '\0';

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target <= arr[mid]) {
                ans = arr[mid];
                end = mid - 1;
            }else{
                start = mid + 1;
            }

        }
        if (ans != '\0') {
            System.out.println("Nearest largest element than " + target + " is " + ans);
        } else {
            System.out.println("There is no element greater than " + target);
        }
    }
}
