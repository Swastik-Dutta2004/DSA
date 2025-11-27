package Practice;

import java.util.Scanner;

public class DailySales {
    static Scanner sc = new Scanner(System.in);
    static int[] userInput(){
        System.out.println("Enter sales of 5 days: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void arrangment(int arr[]){
        
    }
}
