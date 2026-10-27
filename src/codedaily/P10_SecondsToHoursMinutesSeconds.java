package codedaily;

import java.util.Scanner;

public class P10_SecondsToHoursMinutesSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seconds : ");
        int totalSecond = sc.nextInt();

        if (totalSecond < 0){
            System.out.println("Seconds can't be negative!!");
        }else {
            int hours = totalSecond / 3600;
            int remaining = totalSecond % 3600;
            int minutes = remaining / 60;
            int seconds = remaining % 60;

            System.out.println("Hours : " + hours);
            System.out.println("Minutes : " + minutes);
            System.out.println("Seconds : " + seconds);
        }
        sc.close();
    }
}