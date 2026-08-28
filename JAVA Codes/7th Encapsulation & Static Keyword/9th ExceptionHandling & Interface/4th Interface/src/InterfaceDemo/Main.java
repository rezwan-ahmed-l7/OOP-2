package InterfaceDemo;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTime("Rezwan", 30000);
        Employee e2 = new PartTime("Sacchoy", 40, 500);
        Employee e3 = new Contract("Avoy", 25000);

        e1.showInfo();
        System.out.println();

        e2.showInfo();
        System.out.println();

        e3.showInfo();
    }
}