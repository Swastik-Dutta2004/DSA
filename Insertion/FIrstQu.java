package Insertion;

import java.util.Arrays;

public class FIrstQu {
    public static void main(String[] args) {
    int[] arr = {2,0,2,1,1,0};
    Insertion(arr);
    System.out.println(Arrays.toString(arr));
  }

    static void Insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    Swapping(arr, j - 1, j);
                }else{
                    break;
                }
            }
        }
    }

    static void Swapping(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
