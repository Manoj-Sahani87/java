package Functions;

import java.util.Scanner;

public class Table {
    public static void printTable(int n){
        for (int i = 1; i<= 10; i++){
            System.out.println(n + "*" + i + "=" + (n * i));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int n = sc.nextInt();

        printTable(n);
        sc.close();
    }
}