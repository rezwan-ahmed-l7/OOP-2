package Polymorphism;

public class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        System.out.println("Triangle area: " + (0.5 * base * height));
        return 0;
    }
}