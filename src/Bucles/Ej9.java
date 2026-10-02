package Bucles;

import java.util.Scanner;

public class Ej9 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        int divisionRestoCero = 0;
        System.out.println("Dime un numero positivo: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % 1 == 0) {
                divisionRestoCero++;
            }
        }
        if (divisionRestoCero == 2) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
}