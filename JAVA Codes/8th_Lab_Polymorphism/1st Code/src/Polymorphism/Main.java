package Polymorphism;

public class Main {
    public static void main(String[] args) {

        StudentInfo s1 = new StudentInfo();
        s1.display();

        s1 = new StudentOne();
        s1.display();

        s1 = new StudentTwo();
        s1.display();
    }
}
