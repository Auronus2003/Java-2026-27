package unidad1.Arrays;

import java.util.Random;

public class Array10 {
    static void main() {
        Random random = new Random();
        int[] enteros1 = new int[100];
        int[] enteros2 = new int[100];
        int j = enteros1.length - 1;

        System.out.print("Numeros: ");

        for (int i = 0; i < enteros1.length; i++) {
            enteros1[i] = random.nextInt(1, 101);
            System.out.print(enteros1[i] + ",");
        }
        System.out.println();
        System.out.print("Numeros inversos: ");
        for (int i = 0; i < enteros2.length; i++) {
            enteros2[i] = enteros1[j];
            j--;
            System.out.print(enteros2[i] + ",");
        }
    }
}