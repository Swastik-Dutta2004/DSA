package Practice;

import java.util.Scanner;

public class LinerSearch3 {
    static Scanner sc = new Scanner(System.in);
    static int[] findelement(){
        System.out.println("Enter 5 numbers: ");
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void indexNumber(int arr[]){
        System.out.println("Enter the number you want to find: ");
        int target = sc.nextInt();
        boolean found;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("Your element has appeared in the index number: " + arr[i]);
                found = true;
            }
        }
        if(!found){
            System.out.println("Didn't find your element");
        }
    }
}
