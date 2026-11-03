package unidad1.Strings;

import java.util.Scanner;

public class Ej6 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una cadena de caracteres");
        String frase = sc.nextLine().toUpperCase();
        System.out.println("Dime una letra para contar cuantas hay.");
        char letra = sc.nextLine().toUpperCase().charAt(0);
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }

        System.out.println("La letra " + letra + " aparece: " + contador);
    }
}
