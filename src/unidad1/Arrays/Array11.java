package unidad1.Arrays;

import java.util.Random;
import java.util.Scanner;

public class Array11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 21);
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Dame el primer valor");
        int numeros1 = sc.nextInt();

        System.out.println("Dame el segundo valor");
        int numeros2 = sc.nextInt();
        if () {
            for (int i = 0; i < array.length; i++) {
                array[numeros1] = numeros2;
                System.out.print(array[i] + " ");
            }
        }
    }
}
