package unidad1.Arrays;

import java.util.Scanner;

public class Array16 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        char[] arrayletras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        System.out.println("Introduce un DNI: ");
        int DNI = sc.nextInt();

        int resto = DNI % 23;

        System.out.println(DNI + " - " + arrayletras[resto]);
    }
}