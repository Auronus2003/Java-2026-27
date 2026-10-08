package unidad1.Bucles;

import java.util.Scanner;

public class Ej12 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        for (int n = 1; n <= 100; n++) {

            if (n == 1) {
                System.out.println(n + " No es primo");

            } else {
                int divisionRestoCero = 0;
                int i = 2;
                while (i < n && n % i != 0) {
                    i++;
                }
                if (i < n) {
                    System.out.println(n + " No es primo");
                } else {
                    System.out.println(n + " Si es primo");
                }
            }
        }
    }
}
