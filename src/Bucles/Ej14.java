package Bucles;

import java.util.Scanner;

public class Ej14 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int n;
        int contador = 0;
        int i = 3;

        System.out.println("Dame un numero");
        n = sc.nextInt();

        do {
            System.out.println(i);
            i += 3;
            suma += i;
            contador++;
        } while (i <= n);

        System.out.println("Contador: " + contador);
        System.out.println("Suma: " + suma);
    }
}
