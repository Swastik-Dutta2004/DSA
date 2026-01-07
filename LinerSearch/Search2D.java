package LinerSearch;

import java.util.Scanner;

public class Search2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row: ");
        int r = sc.nextInt();
        System.out.println("Enter the column: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] =sc.nextInt();
            }
        }

        System.out.println("Enter the Target value: ");
        int target = sc.nextInt();

        SearchIn2D(arr, target);

    }
    static void SearchIn2D(int[][] arr, int target){
        boolean found = false;
        int row = 0;
        int column = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    row = i;
                    column = j;
                    found = true;
                }
            }
        }
        System.out.println("Your target element found at row number " + row + " in the column of " + column);
    }
}
