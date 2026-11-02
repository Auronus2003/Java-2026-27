package unidad1.Strings;

import java.util.Scanner;

public class Ej3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String Nombre =  sc.nextLine();
        System.out.println("Introduce el primer apellido");
        String Apellidos1 = sc.nextLine();
        System.out.println("Introduce el segundo apellido");
        String Apellidos2 = sc.nextLine();

        System.out.println((Nombre.substring(0,3).toUpperCase().concat(Apellidos1.substring(0,3).toUpperCase().concat(Apellidos2.substring(0,3).toUpperCase()))));
    }
}
