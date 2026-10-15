package unidad1.Arrays;

import java.util.Scanner;

public class Array3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Dame 10 numeros");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextInt();
            System.out.println(numeros[i]);
        }
        for (int i = numeros.length; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}