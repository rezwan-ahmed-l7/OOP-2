package ExceptionHandling;

public class ExceptionHandler {

    public void checkMarks(Student s) {
        try {
            if (s.marks < 0 || s.marks > 100) {
                throw new Exception("Invalid marks! Must be between 0 and 100");
            }
            if (s.marks < 40) {
                throw new Exception(s.name + " has failed");
            }
            System.out.println(s.name + " has passed");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}