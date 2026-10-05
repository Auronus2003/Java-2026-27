package Bucles;

import java.util.Scanner;

public class Ej13 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;
        double media;
        do {
            System.out.println("Dime un numero: ");
            numero = sc.nextInt();
            suma += numero;
            contador++;

        } while (suma <= 10000);
        media = suma / contador;
        System.out.printf("media:%.2f%n ", media);
        System.out.println("Total acumulado: " + suma);
        System.out.println("Cantidad de números: " + contador);
    }
}