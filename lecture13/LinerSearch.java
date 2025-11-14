package lecture13;

public class LinerSearch {
    public static void main(String[] args) {
        int [] nums = {1, 3,5,7,63,23,89};
        int target = 63;
        liner(nums, target);
    }

    static void liner(int [] arr, int target){
        if (arr.length == 0) {
            System.out.println("Enter somethink into the array");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Found the target in index number: " + i);
            }
        }
    }
}
