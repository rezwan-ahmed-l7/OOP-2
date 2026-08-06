package ForthLab;

import java.util.Scanner;

public class ClassOne {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");

        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        sc.close();
    }
}
