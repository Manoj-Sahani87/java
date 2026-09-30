package Exercise;
// Write a program to enter the number till the user wants and at the end
// it should display the count of positive, negative and zero entered.
import java.util.*;

public class exercise_08 {
    public static void main(String[] args) {
        int positive = 0, negative = 0, zero = 0;
        System.out.print("Press 1 to continue & 0 to stop : ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while(input == 1 ){
            System.out.print("Enter your number : ");
            int number = sc.nextInt();
            if (number > 0){
                positive++;
            }else if (number < 0){
                negative++;
            }else {
                zero++;
            }
            System.out.print("Press 1 to continue & 0 to stop : ");
            input = sc.nextInt();
        }
        System.out.println("Positive : " + positive);
        System.out.println("Negative : " + negative);
        System.out.println("Zero : " + zero);
    }
}