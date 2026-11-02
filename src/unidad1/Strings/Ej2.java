package unidad1.Strings;

import java.util.Scanner;

public class Ej2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un nombre");
        String nombre = sc.nextLine();
        System.out.println("Introduce otro nombre");
        String nombre2 = sc.nextLine();

        if (nombre.equalsIgnoreCase(nombre2)) {
            System.out.println("Nombres son iguales");
        }else  {
            System.out.println("Nombre no son iguales");
        }
    }
}
