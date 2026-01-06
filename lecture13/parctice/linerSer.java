package lecture13.parctice;

public class linerSer {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int target = 7;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                int index = i;
                System.out.println(index);
            }
        }
    }
}
