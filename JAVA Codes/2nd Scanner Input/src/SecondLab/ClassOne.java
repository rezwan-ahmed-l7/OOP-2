package SecondLab;

import java.util.Scanner;

public class ClassOne {

    public static void main(String[] args) {

        Scanner ac = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int a = ac.nextInt();
        System.out.println("The Number is: " + a);
        System.out.println();

        System.out.print("Enter a Letter: ");
        String b = ac.next();
        System.out.println("The letter is: " + b);
        System.out.println();

        ac.close();

    }
}
