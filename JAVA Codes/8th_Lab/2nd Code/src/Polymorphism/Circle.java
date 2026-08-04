package Polymorphism;

public class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        System.out.println("Circle area is: " + (3.1416 * radius * radius));
        return 0;
    }
}