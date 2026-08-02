package SecondLab;

import java.util.Scanner;

public class ClassThree {

    public static void main(String[] args) {

        Scanner ec = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int e = ec.nextInt();

        Scanner fc = new Scanner(System.in);
        System.out.print("Enter 2nd Number: ");
        int f = fc.nextInt();

        if (e > f) {
            System.out.println("1st Number is Greater");
        } else if (f > e) {
            System.out.println("2nd Number is Greater");
        } else {
            System.out.println("Both Numbers are Equal");
        }

        ec.close();
        fc.close();
    }

}
