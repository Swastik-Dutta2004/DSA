package lecture13.parctice;

public class sum {
    public static void main(String[] args) {
        int arr [] =  {12,3,4,56,7,87};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
        }
        System.out.println(sum);
    }
}
