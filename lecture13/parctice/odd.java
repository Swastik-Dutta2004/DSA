package lecture13.parctice;

public class odd {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]% 2 == 0) {
                System.out.println("Even numbers: " + arr[i]);
            }
            if (arr[i] % 2 != 0) {
                System.out.println("odd numbers: " + arr[i]);
            }
            
        }
    }
}
