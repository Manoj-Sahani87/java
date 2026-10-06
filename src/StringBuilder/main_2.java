package StringBuilder;

public class main_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println(sb);
        for (int i = 0; i < sb.length() / 2; i++){
            int front = 0;
            int back = sb.length() - 1 - i; // 5 - 1 - 0;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}