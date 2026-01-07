package LinerSearch;

import java.util.Scanner;

public class studentID {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of total IDs: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter ID no." + i + ": ");
            arr[i] = sc.nextInt();
        }
        
        CountStudentsID(arr);

    }
    static void CountStudentsID(int[] arr){
        int count = 1;
        int id = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    id = arr[i];
                    count++;
                }
            }
        }
        if (count > 1) {
            System.out.println(id+ " this id has appered "+ count+ " times");
        }
        else{
            System.out.println("Every IDs are unique");
        }
    }
}
