package ExceptionHandling;

public class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}