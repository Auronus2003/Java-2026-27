package Bucles;

import java.util.Scanner;

public class Ej15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int horas_transcurridas = 0;
        int dia = 0;
        int hora = 0;
        int dia2 = 0;
        int hora2 = 0;
        System.out.println("Introduce la primera hora");
        System.out.print("Dia (1-7): ");
        dia = sc.nextInt();
        System.out.print("Hora (0-23): ");
        hora = sc.nextInt();

        System.out.println("Introduce la segunda hora");
        System.out.print("Dia (1-7): ");
        dia2 = sc.nextInt();
        System.out.print("Hora (0-23): ");
        hora2 = sc.nextInt();

        if ((dia <= 7 && dia2 <= 7) && (hora <= 24 && hora2 <= 24)) {
            horas_transcurridas = (hora2 - hora) + (24 * (dia2 - dia));
            System.out.print("Horas transcurridas = " + horas_transcurridas);
        }else{
            System.out.println("Mal introducido");
        }
    }
}
