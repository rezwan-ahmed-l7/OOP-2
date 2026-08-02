package SecondLab;

import java.util.Scanner;

public class ClassFive {

    public static void main(String[] args) {

        Scanner hc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = hc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("It is a Leap Year");
        } else {
            System.out.println("It is Not a Leap Year");
        }

        hc.close();
    }

}
