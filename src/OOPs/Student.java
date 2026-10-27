package OOPs;

public class Student {
    int rollNo = 25;
    String studentName = "manoj";

    public static void main(String[] args) {
        Student obj1 = new Student();
        System.out.println(obj1.rollNo);
        System.out.println(obj1.studentName);

        Student obj2 = new Student();
        obj2.rollNo = 32;
        obj2.studentName = "Rohan";
        System.out.println(obj2.rollNo);
        System.out.println(obj2.studentName);
    }
}