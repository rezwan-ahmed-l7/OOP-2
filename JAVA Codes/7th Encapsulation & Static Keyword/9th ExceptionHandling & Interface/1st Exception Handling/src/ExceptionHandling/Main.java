package ExceptionHandling;

public class Main {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        try {
            c.divide(10, 2);
            c.divide(10, 0);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
