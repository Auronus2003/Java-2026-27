package unidad1;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int contrasena = 1234;
        int pass;
        int intentos = 0;
        do {
            System.out.println("Dime una contraseña");
            pass = sc.nextInt();
            if (pass == contrasena) {
                System.out.println("La contraseña es correcta");
            } else {
                System.out.println("La contraseña es incorrecta");
            }
            intentos++;
        } while (intentos < 4 && pass != contrasena);
    }
}