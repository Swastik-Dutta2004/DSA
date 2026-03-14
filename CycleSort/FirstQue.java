    package CycleSort;

    import java.util.Arrays;

    public class FirstQue {
        public static void main(String[] args) {
            int[] arr = {5,2,3,1,4};
            CycleSerch(arr);
            System.out.println(Arrays.toString(arr));
        }
        static void CycleSerch(int[] arr){
            int i = 0;
            
            while (i < arr.length) {
                int correctIndex = arr[i] - 1;  

                if (arr[i] != arr[correctIndex]) {
                    swap(arr, i, correctIndex);
                }else{
                    i++;
                }
            }
        }

        static void swap(int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

    }
