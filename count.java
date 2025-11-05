// public class count {
//     public static void main(String[] args) {
//         int a = 1234256252;
//         int count = 0;

//         while (a > 0) {
//             int temp = a % 10;
//             if (temp == 2) {
//                 count++;
//             }
//             a /= 10;
//         }
//         System.out.println(count);
//     }

// }

public class count {
    public static void main(String[] args) {
        int digit = 0;
        int a = 1234;
        while (a > 0) {
            int temp = a % 10;
            digit = digit * 10 + temp;  
            a /= 10;
        } 
        System.out.println(digit);
    }
}
