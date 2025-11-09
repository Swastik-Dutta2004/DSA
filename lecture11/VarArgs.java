package lecture11;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fuck(1,2,3,4,5,65,7,8,9899);
        suck(4, 0, "swastik");
    }

    static void fuck(int ...var){
        System.out.println(Arrays.toString(var));
    }

    static void suck(int a, int b, String ...v){
    System.out.println(a + ", " + b + " → " + Arrays.toString(v));
}

}
