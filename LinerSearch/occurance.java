package LinerSearch;

import java.util.Scanner;

public class occurance {
    public static void main(String[] args) {
        int[] arr = {12,3,4,56,67,67};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element you want to find: ");
        int target = sc.nextInt();
        
        int result = countOccurance(arr, target);
        System.out.print("Your target element has appeared "+ result +" times.");
    }
    static int countOccurance(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        
        return count;
    }
}
