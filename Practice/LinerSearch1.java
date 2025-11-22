package Practice;

import java.util.Scanner;

public class LinerSearch1 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;

    int [] arr = new int[5];
    System.out.println("Enter 5 numbers: ");
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }

    System.out.println("Enter the number you wnat to find: ");
    int target = sc.nextInt();

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            count ++ ;
        }
        if (count > 0) {
            System.out.println("Your enter number has appeared" + count + "times");
        }else {
            System.out.println("Didn't found");
        }
    }
   }
   
}
