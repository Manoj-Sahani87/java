package Conditional_statement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Button between (1 - 3) : ");
        int button = sc.nextInt();

        switch (button){
            case 1:
                System.out.println("HELLO");
                break;
            case 2:
                System.out.println("NAMASTE");
                break;
            case 3:
                System.out.println("BONJOUR");
                break;
            default:
                System.out.println("Invalid Button!!");
        }
    }
}