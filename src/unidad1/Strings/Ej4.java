package unidad1.Strings;

import java.util.Scanner;

public class Ej4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] contadores = new int[5];
        int pos;
        String vocales = "aeiou";
        System.out.println("Dime una frase:");
        String frase = sc.nextLine().toUpperCase();
        for (int i = 0; i < frase.length(); i++) {
            pos = vocales.indexOf(frase.charAt(i));
            if (pos != -1) {
                contadores[pos]++;
            }
        }
        for (int i = 0; i < contadores.length; i++) {
            System.out.println("la vocal " + vocales.charAt(i) + " aparece " + contadores[i]);
        }
    }
}
