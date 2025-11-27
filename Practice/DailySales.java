package Practice;

import java.util.Scanner;

public class DailySales {
    public static void main(String[] args) {
        int arr[] = userInput();
        Maximum(arr);
        Minimun(arr);
        
    }
    static Scanner sc = new Scanner(System.in);

    static int[] userInput(){
        System.out.println("Enter sales of 5 days: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void Maximum(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum sale is: "+ max);
    }
    static void Minimun(int arr[]){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        } 
        System.out.println("The minimun sale is: "+ min);
    }

}
