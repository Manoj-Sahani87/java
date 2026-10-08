package Bit_Manipulation;

import java.util.Scanner;

public class Update_BIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int oper = sc.nextInt();

        // oper = 1 : set   oper = 0 : clear

        int n = 5;      // 0101 ->  0111  -> decimal 7
        int pos = 1;

        int bitMask = 1 << pos;
        if (oper == 1) {
            // set
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        } else {
            // clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}