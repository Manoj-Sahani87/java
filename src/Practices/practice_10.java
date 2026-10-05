package Practices;

import java.util.Scanner;

public class practice_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Email : ");
        String email = sc.next();

        String userName = "";

        for (int i = 0; i < email.length(); i++){
            if (email.charAt(i) == '@'){
                break;
            }else {
                userName += email.charAt(i);
            }
        }
        System.out.println("Remove @gmail.com in given value : " + userName);
    }
}