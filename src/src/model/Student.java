
package model;

public class Student {

    // Student properties
    private int studentId;
    private String studentName;
    private int age;
    private String course;
    private double marks;

    // Constructor
    public Student(int studentId, String studentName,
                   int age, String course, double marks) {

        this.studentId = studentId;
        this.studentName = studentName;
        this.age = age;
        this.course = course;
        this.marks = marks;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }
}

