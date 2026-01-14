package BinarySearch;


public class RotationCountWithDuplicates {
    public static void main(String[] args) {
    int[] arr = {2, 2, 2, 3, 4, 2, 2};
    
    int rotations = countRotations(arr);
    
    System.out.println("Rotation Count: " + rotations);
    }

    static int countRotations(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            
            if (arr[mid] < arr[end]) {
                end = mid;
            }
            
            else if (arr[mid] > arr[end]) {
                start = mid + 1;
            }
            
            else {
                end--;
            }
        }
        
        return start;
    }

}
