package InterfaceDemo;

public class Contract implements Employee {
    String name;
    double amount;

    Contract(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public double calculateSalary() {
        double tax = amount * 0.05;
        return amount - tax;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: Contract");
        System.out.println("Salary: " + calculateSalary() + " Tk");
    }
}