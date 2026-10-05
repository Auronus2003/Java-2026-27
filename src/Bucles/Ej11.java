package Bucles;

import java.util.Scanner;

public class Ej11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        int sumaImpares = 0;
        int contadorImpares = 0;
        int contador = 0;
        int mayorPar = 0;
        double mediaImpares = 0;
        do {
            System.out.println("Dime un numero positivo: ");
            n = sc.nextInt();
            if (n >= 0) {
                contador++;
                if (n % 2 != 0) {
                    contadorImpares++;
                    sumaImpares += n;
                }
                if (n > mayorPar) {
                    mayorPar = n;
                }
            }
        } while (n >= 0);

        System.out.println("Numeros introducidos: " + contador);
        System.out.println("Impares introducidos: " + contadorImpares);
        System.out.println("Media Impares: " + mediaImpares);
        System.out.println("Mayor pares: " + mayorPar);
    }
}
