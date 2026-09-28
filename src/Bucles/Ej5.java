package Bucles;

import java.util.Scanner;

public class Ej5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero;
        int contraseña = 0000;

        System.out.println("Dime una combinación de 4 cifras: ");
        numero = sc.nextInt();

        do {
            System.out.println("La contraseña es incorrecta");
            System.out.println("TE QUEDAN ENOS INTENTOS");
            contador++;
        } while (numero = !contraseña && contador < 4);
    }
}
