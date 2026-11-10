package unidad1.Strings;

import java.util.Scanner;

public class Ej17 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String texto, textoCofrado = "";
        int desplazamiento, posicion;

        System.out.println("Introduce el texto a cifrar: ");
        texto = sc.nextLine().toLowerCase().replaceAll(" ", "");

        System.out.println("Introduce el desplazamiento César...");
        desplazamiento = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= texto.length(); i++) {
            char letra = texto.charAt(i);
          //  int posicion = posicion.indexOf(letra);
         //   posicion = (posicion + desplazamiento) % posicion;
        }
    }
}
