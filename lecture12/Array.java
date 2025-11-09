package lecture12;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("You entered: " + arr);

        String name[] = new String[4];
        for (int i = 0; i < name.length; i++) {
            System.out.print("Enter the name " + (i + 1) + ": ");
            name[i] = sc.next();
        }
        System.out.println(Arrays.toString(name));
    }

}
