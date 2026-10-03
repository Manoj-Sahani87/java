package Practices;

public class practice_03 {
    public static void main(String[] args) {
        int[] num = {98, 52, 61, 99};
        for (int i = num.length - 1; i >= 0; i--){
            System.out.print(num[i]);
            if (i > 0){
                System.out.print(",");
            }
        }
    }
}