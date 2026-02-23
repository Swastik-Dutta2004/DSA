// https://leetcode.com/problems/find-the-duplicate-number/

package Leetcode;

public class FindDupli {
    public static void main(String[] args) {
        int[] arr = {3,1,3,2,4,5};
        int result = CycleSort(arr);
        System.out.println(result);
    }

    static int CycleSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int currentIndex = arr[i] - 1;

                if (arr[i] != arr[currentIndex]) {
                    Swap(arr, i, currentIndex);
                } else {
                   return arr[i];
                }
            }else{
                i++;
            }

        }
        return -1;
    }

    static void Swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
