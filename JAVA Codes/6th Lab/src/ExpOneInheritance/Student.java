package ExpOneInheritance;

public class Student extends Information {

    public String department;

    public void show2() {
        super.show1();
        System.out.println("Department: " + department);
    }
}
