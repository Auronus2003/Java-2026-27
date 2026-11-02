package unidad1.Strings;

import java.util.Scanner;

public class Ej1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame una cadena de texto:");
        String texto = sc.nextLine();

        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }
}
