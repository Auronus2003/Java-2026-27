package unidad1.Sensores;

import java.util.Random;

public class SensorTemperatura {
    static void main() throws InterruptedException {
        Random random = new Random();
        final int TMIN = 15, TMAX = 30, HMIN = 30, HMAX = 70, AUSENCIA = 0, PRESENCIA = 1;
        final int LECTURAS_ANOMALAS = 3, SENSIBILIDAD = 500;
        int sensorT, sensorH, sensorP, lecturas;
        int contAnomaliasT, contAnomaliasH, contAnomaliasP;
        int alarmasT, alarmasH, alarmasP;
        int tMaxima, tMinima, hMaxima, hMinima, tSuma, hSuma;

        contAnomaliasT = contAnomaliasH = contAnomaliasP = 0;
        tSuma = hSuma = lecturas = 0;
        tMaxima = hMaxima = Integer.MIN_VALUE;
        tMinima = hMinima = Integer.MAX_VALUE;

        while (true) {

            // Generar lecturas sensores
            sensorT = random.nextInt(10, 41);
            sensorH = random.nextInt(20, 91);
            sensorP = random.nextInt(0, 2);
            // Contar lecturas
            lecturas++;

            // Mostrar lecturas sensores
            System.out.println("Lecturas actuales");
            System.out.println("\t- Temperatura: " + sensorT + "ºC");
            System.out.println("\t- Humedad: " + sensorH + "%");
            System.out.println("\t- Presencia: " + sensorP);

            Thread.sleep(SENSIBILIDAD);
        }
    }
}
