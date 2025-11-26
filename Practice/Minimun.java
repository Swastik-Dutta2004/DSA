package Practice;

import java.util.Scanner;

public class Minimun {
    public static void main(String[] args) {
        int arr[] = minimunElemen();
    }
    static Scanner sc = new Scanner(System.in);
    static int[] minimunElemen (){
        System.out.println("Enter 5 elements: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void 
}
