package lecture11;

import java.util.Scanner;

public class Armsrtong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int n = sc.nextInt();
        isArmsrtong(n);
    }
    static void isArmsrtong(int n){
        int ori = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem* rem;
        }
        if (sum == ori) {
            System.out.println("It is an Armstrong number");
        }
        System.out.println("Its is not an Armstrong Number");
    }
}