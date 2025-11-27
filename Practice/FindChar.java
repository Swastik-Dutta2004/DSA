package Practice;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String s = sc.nextLine();

        System.out.println("Enter the element you want to find:");
        String input = sc.next();
        char target = input.charAt(0);

        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                found = true;
                System.out.println("Your element has found in the index number: "+ i);
            }
        }
        if (!found) {
            System.out.println("Didn't found ");
        }
    }

}
