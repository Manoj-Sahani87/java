package functionsAndMethods;

import java.util.Scanner;

public class greeting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;
    }
    static String greet(){
        String greeting = "How are you";
        return greeting;
    }
}