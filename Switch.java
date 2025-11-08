// import java.util.Scanner;
// public class Switch {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String fruit = sc.next();

//         switch (fruit) {
//             case "mango":
//                 System.out.println("king of the fruit");
//                 break;
//             case "Banana":
//                 System.out.println("Le ra luand ke ");
//                 break;
//             case "Apple":
//                 System.out.println("Nice!");
//                 break;
//             case "Chree":
//                 System.out.println("👍👍");
//                 break;
        
//             default:
//                 break;
//         }
//     }
// }

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1:Sandwitch - 120, 2: Chicken Chowmin - 70, 3:Mixed Fried Rice - 130, 4:Cold Coffey - 70");
        System.out.print("Enter the number of tha order you want: ");
        int num  = sc.nextInt();
        switch (num) {
            case 1:
            System.out.println("Sandwitch - 120");
                break;
            case 2:
            System.out.println("Chicken Chowmin - 70");
                break;
            case 3:
            System.out.println("Mixed Fried Rice - 130");
                break;
            case 4:
            System.out.println("Cold Coffey - 70");
                break;
            case 5:
            System.out.println("Thank you for vsisting");
                break;
            default:
            System.out.println("Invaild menu item");
                break;
        }
    }
}
