package unidad1.Arrays;

import java.util.Scanner;

public class Array5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
        int numero;
        System.out.println("Dame un numero(0-6): ");
        numero = sc.nextInt();

        for (String n : diasSemana){
            System.out.println(numero = diasSemana[n]);
        }
    }
}
