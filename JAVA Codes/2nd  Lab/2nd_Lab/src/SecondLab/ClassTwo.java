package SecondLab;

import java.util.Scanner;

public class ClassTwo {

    public static void main(String[] args) {

        Scanner cc = new Scanner(System.in);
        System.out.print("Enter 1st Float Number: ");
        float c = cc.nextFloat();

        Scanner dc = new Scanner(System.in);
        System.out.print("Enter 2nd Float Number: ");
        float d = dc.nextFloat();

        float Number = 2 * (c + d);
        System.out.println("The Answer is " + Number);

        cc.close();
        dc.close();
    }
}
