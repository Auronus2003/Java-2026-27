package unidad1.Bucles;

import java.util.Scanner;

public class Ej8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int positivos = 0;
        int negativos = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.print("Dime 10 numeros: ");
            numero = sc.nextInt();
            if (numero <= 0) {
                negativos++;
            } else {
                positivos++;
            }
        }
        System.out.println("Numeros positivos: " + positivos);
        System.out.println("Numeros negativos: " + negativos);
    }
}
