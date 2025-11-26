package Practice;

import java.util.Scanner;

public class MissingID {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = TakeInput();
        findElement(arr);
    }

    static int[] TakeInput() {
        System.out.print("Enter your Ids: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void findElement(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                int Missing = arr[i] + 1;
                System.out.print("Your Missing ID is: " + Missing);
            }
        }
    }

}
