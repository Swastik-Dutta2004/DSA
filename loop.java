import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = scanner.nextInt();

        // if (salary > 10000) {
        //     System.out.println("well done");
        // } else {
        //     System.out.println("Work hard bsdk");
        // }
        // scanner.close();

        // for (int i = 1; i <= num; i++) {
        //     System.out.println(i);
        // }
        int i = 1;
        while ( i <= num) {
            System.out.println(i);
            i += 1;
        }
    }

}