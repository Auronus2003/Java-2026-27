package unidad1.Strings;

import java.util.Scanner;

public class Ej14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String letrasDNI = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dni;
        int numero;
        char letra;

        System.out.println("Comprobar letra DNI...");
        System.out.println("DNI: ");
        dni = sc.nextLine().toUpperCase();

        numero = Integer.parseInt(dni.substring(0, 8));
        letra = dni.charAt(8);

        if (letra == letrasDNI.charAt(numero % 23)) {
            System.out.println("Es correcto");
        } else {
            System.out.println("No Es correcto");
        }
    }
}