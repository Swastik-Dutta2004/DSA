package LinerSearch;

import java.util.Scanner;

public class Occurance2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        firstOccu(arr, target, n);
        lasttOccu(arr, target, n);
    }
    static int firstOccu(int[] arr, int target, int index){
        boolean occurance = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                occurance = true; 
                break;
            }
        }
        if (true) {
            System.out.println("Target element first occurance is in "+ index + " index.");
        }
        return -1;
    }
    static int lasttOccu(int[] arr, int target, int index){
        boolean occurance = false;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == target) {
                index = i;
               occurance = true; 
               break;
            }
        }
        if (true) {
            System.out.println("Target element last occurance is in "+ index + " index.");
        }
        return -1;

    }
}
