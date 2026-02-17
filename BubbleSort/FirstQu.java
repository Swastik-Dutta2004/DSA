import java.util.Arrays;

public class FirstQu {
    public static void main(String[] args) {
        int[] arr = {-21, 34, 0, -3, 8};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr){
        boolean Swapping;
        for (int i = 0; i < arr.length; i++) {
            Swapping = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    Swapping = true;
                }
            }
            if (!Swapping) {
                break;
            }
        }
    }
}
