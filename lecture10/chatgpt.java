package lecture10;

import java.util.Scanner;

public class chatgpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operator: ");
        String c = sc.next();
        switch (c) {
            case "+":
                System.out.print("Ans:" + (a + b));
                break;
            case "-":
                System.out.print("Ans:" +( a - b));
                break;
            case "*":
                System.out.print("Ans:" + (a * b));
                break;
            case "/":
                System.out.print("Ans:" +( a / b));
                break;
            case "%":
                System.out.print("Ans:" + (a % b));
                break;
        
            default:
                break;
        }
    }
    
}
