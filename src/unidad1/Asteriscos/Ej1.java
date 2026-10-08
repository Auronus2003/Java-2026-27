package unidad1.Asteriscos;

import java.util.Scanner;

public class Ej1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Dime un numero: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print(" * ");
        }
    }
}
