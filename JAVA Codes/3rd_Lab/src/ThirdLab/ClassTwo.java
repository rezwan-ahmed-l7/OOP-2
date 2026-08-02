package ThirdLab;

import java.util.Scanner;

public class ClassTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        switch (n) {

            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Tow");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not a number");
                break;
        }
        sc.close();
    }
}
