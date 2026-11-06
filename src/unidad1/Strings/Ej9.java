package unidad1.Strings;

import java.util.Scanner;

public class Ej9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String frase, sinletra;
        char letra;
        int contador1 = 0;
        int contador2 = 0;

        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();

        System.out.println("Introduce la letra: ");
        letra = sc.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador1++;
            }
        }
        System.out.println("Veces que aparece(Recorriendo): " + contador1);

        //Replace
        sinletra = frase.replace(String.valueOf(letra), "");
        contador2 = frase.length() - sinletra.length();

        System.out.println("Veces que aparece (con replace): " + contador2);
    }
}
