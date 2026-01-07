package LinerSearch;

public class SearEle {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,98};
        int target = 98;
        System.out.println(LinerSearch(arr, target));
        
    }

    static int LinerSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Your targeted value find in the index of: " + i);
            }
        }
        return -1;
    }
}
