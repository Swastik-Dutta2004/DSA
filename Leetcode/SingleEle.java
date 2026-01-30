package Leetcode;

public class SingleEle {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        int ans = Find(arr);
        System.out.println(ans);
    }

    static int Find(int[] arr) {
        int s = 0, e = arr.length - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;

            if (mid % 2 == 1) {
                mid--;
            }
            if (arr[mid] == arr[mid + 1]) {
                s = mid + 2;
            } else {
                e = mid;
            }
        }
        return arr[s];
    }

}
