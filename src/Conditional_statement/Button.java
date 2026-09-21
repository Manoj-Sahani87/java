package Conditional_statement;

import java.util.Scanner;

public class Button {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Button Between (1 - 3) : ");
        int button = sc.nextInt();

        if (button == 1){
            System.out.println("HELLO");
        }else if(button == 2){
            System.out.println("NAMASTE");
        }else if (button == 3){
            System.out.println("BONJOUR");
        }else{
            System.out.println("Invalid Button!!");
        }
    }
}