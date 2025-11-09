package lecture10;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the empID: ");
        int emp = sc.nextInt();

        switch (emp) {
            case 1:
                System.out.print("Swastik Dutta");
                break;
            case 2:
                System.out.print("Subhraneel goswami");
                break;
            case 3:
                System.out.println("Enter the department: ");
                String dep = sc.next();

                switch (dep) {
                    case "It":
                        System.out.print("It deparment");
                        break;
                    case "Manag":
                        System.out.print("Managment");
                        break;

                    default:
                        System.out.println("Not valid deparment");
                        break;
                }
                break;

            default:
                System.out.println("Enter a valid empID");
                break;
        }
    }
}
