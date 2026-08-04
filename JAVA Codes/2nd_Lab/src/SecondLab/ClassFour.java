package SecondLab;

import java.util.Scanner;

public class ClassFour {

    public static void main(String[] args) {

        Scanner gc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int g = gc.nextInt();

        if (g % 2 == 0) {
            System.out.println("The Number is Even");
        } else {
            System.out.println("The Number is Odd");
        }

        gc.close();
    }
}
