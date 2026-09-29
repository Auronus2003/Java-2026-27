package Bucles;

import java.util.Scanner;

public class Ej5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int contador = 4;
        int numero;
        int contraseña = 1234;

        do {
            System.out.println("Dime una combinación de 4 cifras: ");
            numero = sc.nextInt();
            if (numero == contraseña) {
                System.out.println("La contraseña es correcta");
            }else {
                contador--;
                System.out.println("La contraseña es incorrecta");
                System.out.println("Te quedan: " + contador + " intentos");
            }
        } while (numero != contraseña && contador!=0);
    }
}
