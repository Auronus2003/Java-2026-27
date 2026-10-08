package unidad1.minibucles;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, resultado;
        System.out.println("Dime un numero");
        n = sc.nextInt();
        System.out.println("Tabla de multiplicar");
        for (int j = 0; j < 10; j++) {
            resultado=n*j;
            System.out.println(n + " x "+ j + " = " + resultado);
        }
    }
}