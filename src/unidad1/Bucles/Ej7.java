package unidad1.Bucles;

import java.util.Scanner;

public class Ej7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero;
        int suma = 0;
        do {
            System.out.println("Introduce un numero(si es negativo finaliza)");
            numero = sc.nextInt();
            if (numero >= 0) {
                suma += numero;
                contador++;
            }
        } while (numero >= 0);
        double media = (double) suma / contador;
        System.out.println("Media: " + media);
    }
}