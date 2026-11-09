package unidad1.Strings;

import java.util.Scanner;

public class Ej11 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una frase: ");
        String frase = sc.nextLine();
        String frase2 = frase.replace(" ", "").toLowerCase();
        boolean palindromo = true;

        for (int i = 0; i < frase2.length() / 2; i++) {
            if (frase2.charAt(i) != frase2.charAt(frase2.length() - 1 - i)) {
                palindromo = false;
            }
        }
        if (palindromo) {
            System.out.println("La frase, " + frase + " es un palindromo.");
        } else {
            System.out.println("La frase, " + frase + " no es un palindromo.");
        }
    }
}
