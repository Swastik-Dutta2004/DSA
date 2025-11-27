package Practice;

import java.util.Scanner;

import javax.script.ScriptContext;

public class Sorted {
    public static void main(String[] args) {
        int arr[] = UserInput();
        sorter(arr);
    }

    static Scanner sc = new Scanner(System.in);

    static int[] UserInput() {
        System.out.println("Enter 5 numbers: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static void sorter(int arr[]) {
        boolean sorter = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                sorter = true;
            }

        }
        if (sorter == true) {
            System.out.println("This is sroted");
        } else {
            System.out.println("Its not sorted");
        }
    }
}
