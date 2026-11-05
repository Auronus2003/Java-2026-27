package unidad1.Strings;

import java.util.Scanner;

public class Ej7 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una cadena de caracteres");
        String frase = sc.nextLine().trim();
        String[] palabras = frase.split(" ");
        System.out.println("Numero de palabras: " + palabras.length);
    }
}