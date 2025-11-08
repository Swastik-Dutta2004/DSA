// public class PremitiveSwap {
//     public static void main(String[] args) {
//         int a = 5 ;
//         int b = 10;
//          System.out.println("Before Swapping: a = " + a + ", b = " + b);

//         swap(a, b);

//         // int temp = a;
//         // a = b;
//         // b = temp;
//         // System.out.println("After Swapping: a = " + a + ", b = " + b);
//     }

//     static void swap(int x, int y) {
//         int temp = x;
//         x = y;
//         y = temp;
//         System.out.println("Inside swap(): x = " + x + ", y = " + y);
//     }
// }


import java.util.Scanner;
public class PremitiveSwap {

    public static void main(String[] args) {
        int arr[] = new int [2];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first Number: ");
        arr[0] =  sc.nextInt();

        System.out.print("Enter second Number: ");
        arr[1] = sc.nextInt();
        
        System.out.println("before swapping the numbers are a:" + arr[0] + ", b: " + arr [1] );

        swap(arr);

        System.out.println("After Swapping:  a = " + arr[0] + ", b = " + arr[1]);

    }

    static void swap(int arr []){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}