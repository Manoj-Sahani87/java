package StringBuilder;

public class main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("shark");
        System.out.println(sb);

        // char at index 0
        System.out.println(sb.charAt(0));

        //set char at index 0
        sb.setCharAt(0 , 'k');
        System.out.println(sb);

        // insert new value
        sb.insert(2, 'n');
        System.out.println(sb);

        // delete value
        sb.delete(2, 3); // delete extra table
        System.out.println(sb);

        // append value at the end of given value
        sb.append("s");
        sb.append("l");
        sb.append("a");
        sb.append("y");
        sb.append("e");
        sb.append("r");
        System.out.println(sb);
    }
}