package ThirdLab;

import java.util.Scanner;

public class ClassThree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 0 && num > 1) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }

        sc.close();
    }
}