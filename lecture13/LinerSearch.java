package lecture13;

public class LinerSearch {
    public static void main(String[] args) {
        int [] nums = {1, 3,5,7,63,23,89};
        int target = 63;
        int ans = liner(nums, target);
        System.out.println(ans);
    }

       static int liner(int[] arr, int target) {
        if (arr.length == 0) {
            return -1; // empty array
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                System.out.println("Found the target in index number: " + i);
            }
        }
        return -1 ;
    }
}
