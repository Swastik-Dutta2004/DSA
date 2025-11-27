package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindChar {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> element = takingele();
    }

   static ArrayList<String> takingele() {
    ArrayList<String> list = new ArrayList<>();

    System.out.println("Enter number of elements: ");
    int n = sc.nextInt();
    sc.nextLine(); // consume newline

    for (int i = 0; i < n; i++) {
        System.out.println("Enter element " + (i + 1) + ": ");
        String value = sc.nextLine();
        list.add(value);
    }
    return list;
}
    static void FindEle (ArrayList<String>list){
        String target = sc.nextLine();
        for (int i = 0; i < array.length; i++) {
            
        }

    }

}
