package lecture13;

import java.util.Scanner;

public class LinerSch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number "+( i+1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number you want to find: ");
        int find = sc.nextInt();        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                System.out.println("Index number is :" + i);
                return;
            }
        }
    }
}
