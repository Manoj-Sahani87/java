package Recursion;
// print factorial of a number n
public class recursion_04 {
    public static int calc_factorial(int n) {
        if (n == 1 || n == 0){
        return 1;
    }

    int fact_nm1 = calc_factorial(n - 1);
    int fact_n = n * fact_nm1;
    return fact_n;
}
    public static void main(String[] args) {
        int n = 5;
        int ans = calc_factorial(n);
        System.out.println(ans);
    }
}