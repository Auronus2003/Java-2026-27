package unidad1.Arrays;

import java.util.Scanner;

public class Array8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int P;
        int Q;
        System.out.println("Dame P:");
        P = sc.nextInt();
        System.out.println("Dame Q:");
        Q = sc.nextInt();
        int[] array = new int[Q - P + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = P + i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}