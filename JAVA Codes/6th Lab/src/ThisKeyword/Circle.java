package ThisKeyword;

public class Circle {

    float radius;

    public Circle(float r) {
        this.radius = r;
    }

    public float Area() {
        System.out.println("Radius of circle: " + (3.14f * radius * radius));
        return (3.14f * radius * radius);
    }
}
