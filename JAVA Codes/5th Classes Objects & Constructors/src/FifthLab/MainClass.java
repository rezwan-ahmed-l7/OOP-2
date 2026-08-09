package FifthLab;

public class MainClass {

    public static void main(String[] args) {

        CSE c1 = new CSE(1024, "Rezwan", 24, "Male");
        c1.info();
        System.out.println();

        CSE c2 = new CSE(1015, "Avoy", 23, "Male");
        c2.info();
        System.out.println();

        CSE c3 = new CSE(1028, "Sacchay", 22, "Male");
        c3.info();
        System.out.println();

        System.out.println("Students of CSE Called: " + CSE.count);
        System.out.println();

        BBA b1 = new BBA(1010, "Mahir", 22, "Male");
        b1.info();
        System.out.println();

        BBA b2 = new BBA(1016, "Abir", 24, "Male");
        b2.info();
        System.out.println();

        System.out.println("Students of BBA Called: " + BBA.count);
        System.out.println();

        ENG e1 = new ENG(1032, "Riko", 23, "Male");
        e1.info();
        System.out.println();

        System.out.println("Students of ENG Called: " + ENG.count);
        System.out.println();

    }

}
