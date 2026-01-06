package Arrays;

import java.util.Scanner;

public class exists {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr =  new int[n];
        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the searched element: ");
        int search = in.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("Your Searched element found in the index number:" + i);
                found = true;
                break;
            }

        }
            if (!found) {
                System.out.println("Not found");
            }
    }
}