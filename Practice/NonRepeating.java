package Practice;

import java.lang.annotation.Repeatable;
import java.util.Scanner;

public class NonRepeating {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = UserInput();
        Repeating(arr);
    }

    static int[] UserInput() {
        System.out.println("Enter 5 input");
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void Repeating(int arr[]) {
        boolean Repeat = true;
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int count = 0;
            
            for (int j = 0; j < arr.length; j++) {
                if (current == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("Non-repeatable number is: " + current);
            }
        }
        System.out.println("No non-repeating element found.");
        
    }
}
