package minibucles;

import java.util.Scanner;

public class Potencia {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int base, potencia, resultado = 1;
        System.out.println("Introduce la base");
        base = sc.nextInt();
        System.out.println("Introduce la potencia");
        potencia = sc.nextInt();

        for (int i = 0; i < potencia; i++) {
            resultado = resultado * base;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
