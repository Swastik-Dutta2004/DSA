package LinerSearch;

import java.util.Scanner;

public class SearchInRange {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of the element: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter the Starting index of the array: ");
        int Start = sc.nextInt();
        System.out.print("Enter the ending index of the array: ");
        int end = sc.nextInt();
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        
        findValue(arr, target, Start, end);
    }
    static void findValue(int[] arr, int target, int start, int end){
        boolean found = false;
        int index = 0;
        for (int i = start ; i <= end; i++) {
            if (arr[i] == target) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println("Your targrt value is in index number: " + index);
        }else{
            System.out.println("Not found");
        }
    }
}
