package Practice;

import java.util.Scanner;

public class Minimun {
    public static void main(String[] args) {
        int arr[] = minimunElemen();
        findElement(arr);
    }
    static Scanner sc = new Scanner(System.in);
    static int[] minimunElemen (){
        System.out.print("Enter 5 elements: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    static void findElement(int arr[]) {
    int min = arr[0];
    int max = arr[0];

    int i = 0;
    int j = arr.length - 1;

    while (i <= j) {
        // check from the left side
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];

        // check from the right side
        if (arr[j] < min) min = arr[j];
        if (arr[j] > max) max = arr[j];

        i++;
        j--;
    }

    System.out.println("Minimum = " + min + " Maximum = " + max);
}

}
