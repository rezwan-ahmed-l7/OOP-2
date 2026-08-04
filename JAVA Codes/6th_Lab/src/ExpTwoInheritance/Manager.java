package ExpTwoInheritance;

public class Manager extends Employee {

    public Double bonus;

    public Manager(int i, String n, Double s, Double b) {
        super(i, n, s);
        bonus = b;
    }

    public void showTotalSalary() {
        super.showInfo();
        System.out.println("Bonus: " + bonus);
    }

}
