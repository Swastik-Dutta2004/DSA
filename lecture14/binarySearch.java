package lecture14;

public class binarySearch {

    public static void main(String[] args) {
        int arr[] = {-12,-43,4,5,6,7,8,98,104};
        int target = 98;
        int result = search(arr, target);
        System.out.println(result);
    }
   static int search(int arr[], int target){
        int start = 0;
        int end = arr.length -1;

        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid - 1; 
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
   }
}
