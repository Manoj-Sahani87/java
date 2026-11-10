package functionsAndMethods;

import java.util.Arrays;

public class multiArgs {
    public static void main(String[] args) {
        //fun();
        multiple(5, 2, "Shark", "rock", "theOne", "theKing");
    }

    static void multiple(int a, int b, String... v) { // (String...) -> variable at args always at the end

    }
    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}