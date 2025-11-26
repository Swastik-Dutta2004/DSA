package Practice;

import java.util.Scanner;

public class LinerSearch2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = elementFound();
        findValue(arr);
    }

    static int[] elementFound() {
        int arr[] = new int[5];
        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int findValue(int arr[]) {
        System.out.println("Enter the number you want to find: ");
        int target = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] == target) {
             count++;
           }
        }

        if (count > 0) {
            System.out.println("Your entered number appears " + count + " time(s).");
        } 
        return -1;
        
    }

}
