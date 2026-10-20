package unidad1.Arrays;

import java.util.Random;

public class Array9 {
    static void main() {
        Random ramdom = new Random();
        int[] numeros = new int[20];
        int[] cubos = new int[20];
        int[] cuadrados = new int[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = ramdom.nextInt(0,100);
            cuadrados[i] = (int) Math.pow(numeros[i], 2);
            cubos[i] = (int) Math.pow(numeros[i], 3);

            System.out.println(numeros[i] + "|" + cuadrados[i] + "|" + cubos[i]);
        }
    }
}
