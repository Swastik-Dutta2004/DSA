package Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class ActiveUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arr = new ArrayList<>();
        int active = 0;
        int inactive = 0;

        System.out.println("Enter how many user you wnat to check: ");
        int n = sc.nextInt();

        System.out.println("Enter 1 for Active and 0 for Inactive user: ");
        for (int i = 0; i < n; i++) {
            int value = sc.nextInt();
            arr.add(value);
        }

        for (int i = 0; i < args.length; i++) {
            if (arr.get(i) == 1) {
                active++;
            } else {
                inactive++;
            }
        }

        System.out.println("Number of Active Users: " + active);
        System.out.println("Number of Inactive Users: " + inactive);

    }
}
