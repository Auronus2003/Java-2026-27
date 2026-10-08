package unidad1.minibucles;

import java.util.Scanner;

public class Pizzeria {
    static void main() {
        Scanner sc = new Scanner( System.in);
        int pizzas;
        double coste, desconto, importeFinal, porcentajeDescuento;

        System.out.println("Introduce el numero de pizzas: ");
        pizzas = sc.nextInt();

        porcentajeDescuento = switch (pizzas) {
            case 1 -> 0;
            case 2 -> 0.20;
            case 3 -> 0.25;
            case 4 -> 0.30;
            case 5 -> 0.35;
            default -> 0.40;
        };

        coste = pizzas * 8;
        desconto = coste * porcentajeDescuento;
        importeFinal = coste - desconto;

        System.out.println("Coste: " + coste);
        System.out.println("Desconto: " + desconto);
        System.out.println("Importe final: " + importeFinal);
    }
}
