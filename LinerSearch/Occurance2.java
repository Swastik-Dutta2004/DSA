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

        FirstOccu(arr, target);
        LasttOccu(arr, target);
    }
    static void FirstOccu(int[] arr, int target){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        System.out.println("Your target value's first occurance is: "+ ans);
    }

    static void LasttOccu(int[] arr, int target){
        int ans = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        System.out.println("Your target value's last occurance is: "+ ans);
    }
}
