package Bucles;

import java.util.Scanner;

public class Ej9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        int divisionRestoCero = 0;
        System.out.println("Dime un numero positivo: ");
        n = sc.nextInt();

        if (n == 1) {
            System.out.println("No es primo");
        } else {
            int i = 2;
            while (i < n && n % 1 != 0) {
                i++;
            }
            if (i < n) {
                System.out.println("No es primo");
            } else {
                System.out.println("Es primo");
            }
        }
    }
}