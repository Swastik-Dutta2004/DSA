package lecture11;
public class Scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 40;
        //Any think that is ininitilised outside the block that can be updated inside the block and anythink that is initialised inside the block that can not be initialised or updated outside the block. we can initilised same variable that is declared inside the block but we cannot declare same variable that is initialised outside the block. Same goes to print the value of variable also.
    {
        a = 30;
        int c = 50;
        System.out.println(c);
    }
    System.out.println(a);
    int c = 60;
    System.out.println(c);
    }
} 