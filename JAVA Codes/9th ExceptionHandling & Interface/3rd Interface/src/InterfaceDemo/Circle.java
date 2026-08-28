package InterfaceDemo;

public class Circle implements Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.1416 * radius * radius;
    }
}