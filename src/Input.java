import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // object
        System.out.print("Enter your name : ");
        String name = sc.nextLine();            // print line
        System.out.println("Your name is : "+name);
    }
}