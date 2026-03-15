package BinarySearch;

public class SortedMatrix {
    static int[] BinarySearch(int[][]arr, int target, int row, int cStart, int cEnd){
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart)/2;

            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            }
 
            if (arr[row][mid] < target) {
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
         return new int[]{-1,-1};
    }


    static int[] Search(int[][] arr, int target){
        int row = arr.length;
        int cols = arr[0].length;

        if (condition) {
            
        }
        return new int[]{-1, -1};
    }
}
