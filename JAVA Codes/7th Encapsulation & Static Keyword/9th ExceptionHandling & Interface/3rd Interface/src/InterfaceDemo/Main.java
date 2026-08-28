package InterfaceDemo;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(10, 5);
        Shape s2 = new Circle(7);
        Shape s3 = new Triangle(10, 6);

        System.out.println("Rectangle Area: " + s1.area());
        System.out.println("Circle Area: " + s2.area());
        System.out.println("Triangle Area: " + s3.area());
    }
}