package ForthLab;

import java.util.Scanner;

public class ClassThree {

    public static void main(String[] args) {

        System.out.print("Enter 9 numbers: ");
        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
