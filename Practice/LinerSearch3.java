package Practice;

import java.util.Scanner;

public class LinerSearch3 {
    public static void main(String[] args) {
        int arr [] = findelement();
        indexNumber(arr);
    }
    static Scanner sc = new Scanner(System.in);
    static int[] findelement(){
        System.out.print("Enter 5 numbers: ");
        int [] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void indexNumber(int arr[]){
        System.out.print("Enter the number you want to find: ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.print("Your element has appeared in the index number: " + i);
                found = true;
            }
        }
        if(!found){
            System.out.println("Didn't find your element");
        }
    }
}
