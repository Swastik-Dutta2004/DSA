import java.util.Arrays;

public class FirstQu {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
  static void Selection(int[] arr){
    for (int i = 0; i < arr.length; i++) {
        int last = arr.length - 1 - i;
        int maxIndex = getMaxIndex(arr, 0, last);
        Swapping(arr, maxIndex, last);
    }
  }
  static int getMaxIndex(int[] arr, int start, int end){
    int max = start;
    for (int i = start; i <= end; i++) {
        if (arr[i] > arr[max]) {
            max = i;
        }
    }
    return max;
  }
  static void Swapping(int[] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
  }
}
