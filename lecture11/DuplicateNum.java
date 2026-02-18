package lecture11;

public class DuplicateNum {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        int ans = Duplicate(arr);
        System.out.println(ans);
    }
    static int Duplicate(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    result = arr[j];
                }
            }
        }
        return result;
    }
}
