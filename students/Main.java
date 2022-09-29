package students;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan");
        Student student2 = new Student("Ivan");
        Student student3 = new Student("Ivan");

        System.out.println(student1.equals(student2));
        System.out.println(student2.equals(student3));
        System.out.println(student1.equals(student3));
    }
}
