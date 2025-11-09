package lecture11;

public class Shadow {
    static int a = 34;

    public static void main(String[] args) {
        int a = 56;
        System.out.println(a);
        fuck();
    }

    static void fuck() {
        System.out.println(a);
    }
}
