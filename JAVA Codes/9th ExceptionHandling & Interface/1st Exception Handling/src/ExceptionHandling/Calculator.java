package ExceptionHandling;

public class Calculator {

    public void divide(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by zero");
        }
        int result = a / b;
        System.out.println("Result: " + result);
    }
}
