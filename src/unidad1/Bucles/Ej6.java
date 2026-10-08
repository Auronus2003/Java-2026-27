package unidad1.Bucles;

import java.util.Scanner;

public class Ej6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int n = sc.nextInt();
        System.out.println("Tabla de multiplicar: ");
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
}
