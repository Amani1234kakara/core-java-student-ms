
import model.Student;

public class Main {

    public static void main(String[] args) {

        Student student1 =
                new Student(101, "Amani", 25, "Java", 85.5);

        Student student2 =
                new Student(102, "Ravi", 24, "Python", 90.0);

        System.out.println("Student 1: " + student1.getStudentName());
        System.out.println("Student ID: " + student1.getStudentId());

        System.out.println("-------------------");

        System.out.println("Student 2: " + student2.getStudentName());
        System.out.println("Student ID: " + student2.getStudentId());
    }
}
