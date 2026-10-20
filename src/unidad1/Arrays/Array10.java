package unidad1.Arrays;

import java.util.Random;

public class Array10 {
    static void main() {
        Random random = new Random();
        int[] enteros1 = new int[100];
        int[] enteros2 = new int[100];

        for (int i = 0; i < enteros1[i]; i++) {
            enteros1[i] = random.nextInt(1,100);
        }
        for (int j = 0; j < enteros2[j]; j--){
            enteros2[j] = enteros1[i];
        }
        System.out.print("Numeros:" + enteros1);
        System.out.print("Numeros:" + enteros2);
    }
}