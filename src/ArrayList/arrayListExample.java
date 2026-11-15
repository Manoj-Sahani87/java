package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any to add items : ");
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        // list.add(98);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index], syntax will not work here
        }
        System.out.println(list);
    }
}