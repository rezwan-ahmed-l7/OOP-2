package InterfaceDemo;

public class PartTime implements Employee {
    String name;
    int hours;
    double rate;

    PartTime(String name, int hours, double rate) {
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }

    public double calculateSalary() {
        return hours * rate;
    }

    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Type: Part Time");
        System.out.println("Salary: " + calculateSalary() + " Tk");
    }
}