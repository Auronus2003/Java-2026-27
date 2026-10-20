package unidad1.Arrays;

import java.util.Scanner;

public class Array7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int M;
        int N;
        System.out.println("Dame N:");
        N = sc.nextInt();
        System.out.println("Dame M:");
        M = sc.nextInt();
        int[] array = new int[N];

        for (int i = 0; i < array.length; i++) {
            array[i] = M;
            System.out.println(array[i]);
        }
    }
}