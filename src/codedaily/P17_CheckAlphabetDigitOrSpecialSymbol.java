package codedaily;

import java.util.Scanner;

public class P17_CheckAlphabetDigitOrSpecialSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);
        if (Character.isLetter(ch)){
            System.out.println("It is an alphabet.");
        } else if(Character.isDigit(ch)) {
            System.out.println("It is a digit.");
        }else {
            System.out.println("It is a special symbol.");
        }
        sc.close();
    }
}