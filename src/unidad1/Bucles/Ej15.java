package unidad1.Bucles;

import java.util.Scanner;

public class Ej15 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int dia1, hora1, dia2, hora2;
        boolean datosValidos;
        do {
            System.out.println("Introduce la primera hora...");
            System.out.print("Día (1-7): ");
            dia1 = sc.nextInt();
            System.out.print("Hora (0-23): ");
            hora1 = sc.nextInt();

            System.out.println("Introduce la segunda hora...");
            System.out.print("Día (1-7): ");
            dia2 = sc.nextInt();
            System.out.print("Hora (0-23): ");
            hora2 = sc.nextInt();

            datosValidos = dia1 >= 1 && dia1 <= 7 && dia2 >= 1 && dia2 <= 7 && hora1 >= 0 && hora1 <= 23 && hora2 >= 0 && hora2 <= 23 && dia2 > dia1;

            if (!datosValidos) {
                System.out.println("Datos incorrectos. El día debe estar entre 1 y 7, la hora entre 0 y 23 " +
                        "y el segundo día debe ser posterior al primero.\n");
            }
        } while (!datosValidos);

        int horasTranscurridas = (hora2 - hora1) + 24 * (dia2 - dia1);
        System.out.println("Horas transcurridas = " + horasTranscurridas);
    }
}
