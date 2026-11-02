package unidad1.Strings;

import java.util.Scanner;

public class Ej5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una cadena de caracteres: ");
        String cadena = sc.nextLine();

        for (int i = cadena.length()-1; i >= 0; i--) {
            System.out.print(cadena.charAt(i));
        }
    }
}
