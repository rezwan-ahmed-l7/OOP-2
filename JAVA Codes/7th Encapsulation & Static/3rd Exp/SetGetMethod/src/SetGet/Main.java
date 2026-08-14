package SetGet;

public class Main {

    public static void main(String[] args) {

        Teacher t = new Teacher();
        t.setData("Zahim Sir", "Lecturer");

        System.out.println("Name: " + t.getName());
        System.out.println("Designation: " + t.getDesignation());
    }

}
