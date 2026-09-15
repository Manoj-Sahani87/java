public class Operators {
    public static void main(String[] args) {
        int a = 8, b = 7;

        // Arithmetic Operators
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Relational Operators
        System.out.println(a > b);   // true
        System.out.println(a < b);   // false
        System.out.println(a == b);  // false
        System.out.println(a != b);  // true
        System.out.println(a >= b);  // true
        System.out.println(a <= b);  // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println(x && y); // false (AND)
        System.out.println(x || y); // true (OR)
        System.out.println(!x); // false (NOT)

        // Unary Operators
        int d = 5;
        System.out.println(-d);   // -5 (negation)
        System.out.println(++d);  // 6  (pre-increment)
        System.out.println(d--);  // 6  (post-decrement, prints before decrementing)
        System.out.println(!true); // false (logical NOT)

        // Bitwise Operators
        int m = 5, n = 3; // 101, 011 in binary
        System.out.println(m & n);  // 1  (AND)
        System.out.println(m | n);  // 7  (OR)
        System.out.println(m ^ n);  // 6  (XOR)
        System.out.println(~m);     // -6 (NOT)
        System.out.println(m << 1); // 10 (left shift)
        System.out.println(m >> 1); // 2  (right shift)

        // Ternary (Conditional) Operator
        int age = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println(result); // Adult

        // instanceof Operator
        String s = "hello";
        System.out.println(s instanceof String); // true
    }
}