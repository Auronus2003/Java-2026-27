package unidad1.Strings;

import java.util.Scanner;

public class Ej15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        String[] palabras = frase.split("[^\\p{L}\\p{N}]+");
        String masLarga = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > masLarga.length()) {
                masLarga = palabras[i];
            }
        }

        if (masLarga.isEmpty()) {
            System.out.println("La frase no contiene ninguna palabra.");
        } else {
            System.out.println("Palabra más larga: " + masLarga);
            System.out.println("Número de caracteres: " + masLarga.length());
        }
    }
}
