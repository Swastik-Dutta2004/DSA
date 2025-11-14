package lecture13;

import java.util.Scanner;

public class TwoDArray {
Scanner sc = new Scanner(System.in);

    static void search(){
        int [][] arr = new int [3][4];
        System.out.print("Enter 12 numbers: ");
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}
