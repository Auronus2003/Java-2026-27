package unidad1.Arrays;

import java.util.Scanner;

public class Array6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Dame diez numeros reales");
            numeros[i] = sc.nextInt();
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }

            if (numeros[i] < minimo){
                minimo = numeros[i];
            }
        }
        System.out.println(maximo);
        System.out.println(minimo);
    }
}
