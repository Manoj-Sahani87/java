package codedaily;

import java.util.Scanner;

public class P16_VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character : ");
        char ch = sc.next().charAt(0);

        char lower = Character.toLowerCase(ch);

        if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u'){
            System.out.println(ch + " is a vowel");
        }else {
            System.out.println(ch + " is a consonant");
        }
        sc.close();
    }
}