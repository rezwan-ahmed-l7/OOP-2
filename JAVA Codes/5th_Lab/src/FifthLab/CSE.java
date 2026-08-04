package FifthLab;

public class CSE {

    static String uni = "BAUST";
    static String dep = "CSE";
    static int count = 0;

    int id;
    String name;
    int age;
    String gender;

    CSE(int i, String n, int a, String g) {
        id = i;
        name = n;
        age = a;
        gender = g;
        count++;
    }

    void info() {
        System.out.println("Department: " + dep);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("University: " + uni);
    }

}
