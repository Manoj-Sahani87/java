package codedaily;

import java.util.Scanner;

public class P20_EligibleVoteOrNot {
    public static void main(String[] args) {
        vote();
    }

    static void vote() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age >= 18) {
            System.out.println("You are eligible to vote");
        } else {
            System.out.println("You aren't eligible for vote");
        }
        sc.close();
    }
}