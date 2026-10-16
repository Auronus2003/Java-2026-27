package unidad1.Arrays;

import java.util.Scanner;

public class Array5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        int numero;

        do {
            System.out.println("Dame un numero(1-7): ");
            numero = sc.nextInt();

            switch (numero) {
                case 1:
                    System.out.println(diasSemana[numero - 1]);
                    break;
                case 2:
                    System.out.println(diasSemana[numero - 1]);
                    break;
                case 3:
                    System.out.println(diasSemana[numero - 1]);
                    break;
                case 4:
                    System.out.println(diasSemana[numero - 1]);
                    break;
                case 5:
                    System.out.println(diasSemana[numero - 1]);
                    break;
                case 6:
                    System.out.println(diasSemana[numero - 1]);
                    break;
                case 7:
                    System.out.println(diasSemana[numero - 1]);
                    break;
                default:
                    System.out.println("No existe ese dia de la semana");
            }
        } while (numero >= 1 && numero <= 7);
    }
}