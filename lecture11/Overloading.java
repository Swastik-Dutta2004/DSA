package lecture11;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        fun(4);
        fun("swastik");
        num(2,4,6);
        num(2,4);
        name(12,34,6,7,9,0);
        name("swa","stik");

    }

    static void fun(int a){
        System.out.println("1st one");
        System.out.println(a);
    }

    static void fun(String b){
        System.out.println("2st one");
        System.out.println(b);
    }

    static void num( int a, int b, int c){
        System.out.println(a + b + c);
    }
    static void num( int a, int b){
        System.out.println(a + b);
    }

    static void name( int ...v){
        System.out.println(Arrays.toString(v) );
    }
    static void name( String ...v){
        System.out.println(Arrays.toString(v) );
    }
}
