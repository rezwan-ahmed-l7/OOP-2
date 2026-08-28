package InterfaceDemo;

public class FullTime implements Employee {
    String name;
    double basic;

    FullTime(String name, double basic) {
        this.name = name;
        this.basic = basic;
    }

    public double calculateSalary() {
        double houseRent = basic * 0.40;
        double medical = basic * 0.10;
        return basic + houseRent + medical;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: Full Time");
        System.out.println("Salary: " + calculateSalary() + " Tk");
    }
}