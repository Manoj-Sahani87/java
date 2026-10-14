package Practices;

public class practice_14 {
    public static int sum(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }
        // Recursive case
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = sum(n);
        System.out.println("Sum = " + result);
    }
}