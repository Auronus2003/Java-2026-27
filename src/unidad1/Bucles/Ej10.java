package unidad1.Bucles;

import java.util.Scanner;

public class Ej10 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int suma = 0;
        int i;

        do {
            System.out.println("Introduce un entero positivo: ");
            n = sc.nextInt();

        } while (n < 0);

        for (i = 1; i <= 3; i++) {
            suma += n + i;
            System.out.println(suma);
        }
    }
}