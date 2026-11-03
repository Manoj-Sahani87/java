package codedaily;

import java.util.Scanner;

public class P19_CheckDivisibleBy3And5 {
    public static void main(String[] args) {
        divisible();
    }
    static void divisible(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("It is divisible by both 3 and 5");
        }else {
            System.out.println("It isn't divisible by both 3 and 5");
        }
        sc.close();
    }
}