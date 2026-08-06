package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape s;

        s = new Rectangle(10, 5);
        s.area();

        s = new Triangle(10, 5);
        s.area();

        s = new Circle(10);
        s.area();
    }
}