package unidad1.Asteriscos;

import java.util.Scanner;

public class Ej2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n;
        int x;
        do {
            System.out.println("Dame un numero");
            n = sc.nextInt();
            System.out.println("Dame otro numero");
            x = sc.nextInt();
        } while (n < 10 && n > 2 && x < 10 && x > 2);
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= x - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
