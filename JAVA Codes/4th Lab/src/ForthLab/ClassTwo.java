package ForthLab;

import java.util.Scanner;

public class ClassTwo {
    public static void main(String[] args) {

        int sum = 0;
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            sum = sum + a[i];
        }
        System.out.println("Sum = " + sum);

        float avg = sum / 10.0f;
        System.out.println("Average = " + avg);

        int min = 99999, max = 0;
        for (int i = 0; i < 10; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Min = " + min);

        for (int i = 0; i < 10; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max = " + max);

        sc.close();
    }
}
