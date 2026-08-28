package ExceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        Student s = new Student(name, marks);
        s.showInfo();

        ExceptionHandler handler = new ExceptionHandler();
        handler.checkMarks(s);

        sc.close();
    }
}