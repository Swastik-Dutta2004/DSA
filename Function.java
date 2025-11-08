import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        sum();
        greeting();
        int result = sum(5, 10);
        System.out.println("The sum from parameters is: " + result);
        marks();
    }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter b number: ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum is: " + sum);
    }

    static void greeting() {
        System.out.println("Hello! Welcome to our program.");
    }

    static int sum(int a, int b) {
        return a + b;

    }

    static void marks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your numbre: ");
        int num = sc.nextInt();
        if (num > 95) {
            System.out.println("Excellent");
        } else if (num > 85) {
            System.out.println("Very Good");
        } else if (num > 70) {
            System.out.println("Good");
        } else if (num > 50) {
            System.out.println("Average");
        } else {
            System.out.println("Fail");
        }

    }
}
