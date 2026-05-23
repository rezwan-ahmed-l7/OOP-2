package ExpTwoInheritance;

public class Employee {

    public int id;
    public String name;
    public Double salary;

    public Employee(int i, String n, Double s) {
        id = i;
        name = n;
        salary = s;
    }

    public void showInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}
