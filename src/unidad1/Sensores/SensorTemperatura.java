package unidad1.Sensores;

import java.util.Random;

public class SensorTemperatura {
    static void main() throws InterruptedException {
        Random random = new Random();
        final int TMIN = 15, TMAX = 30, HMIN = 30, HMAX = 70, AUSENCIA = 0, PRESENCIA = 1;
        final int LECTURAS_ANOMALAS = 3, SENSIBILIDAD = 700;
        int sensorT, sensorH, sensorP, lecturas;
        int contAnomaliasT, contAnomaliasH, contAnomaliasP;
        int contAlarmasT, contAlarmasH, contAlarmasP;
        int tMaxima, tMinima, hMaxima, hMinima, tSuma, hSuma;
        String presencia;

        contAnomaliasT = contAnomaliasH = contAnomaliasP = 0;
        contAlarmasT = contAlarmasH = contAlarmasP = 0;
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

            //Calcular estadísticas
            if (sensorT > tMaxima) tMaxima = sensorT;
            if (sensorT < tMinima) tMinima = sensorT;
            if (sensorH > hMaxima) hMaxima = sensorH;
            if (sensorH < hMinima) hMinima = sensorH;

            if (sensorT < TMIN || sensorT > TMAX) {
                contAnomaliasT++;
            } else {
                contAnomaliasT = 0;
            }
            //contAnomaliasT = (sensorT < TMIN || sensorT > TMAX) ? contAnomaliasT + 1 : 0;
            if (sensorH < HMIN || sensorH > HMAX) {
                contAnomaliasH++;
            } else {
                contAnomaliasH = 0;
            }

            if (sensorP == PRESENCIA) {
                contAnomaliasP++;
            } else {
                contAnomaliasP = 0;
            }
            //contAnomaliasP = (sensorP == PRESENCIA) ? contAnomaliasP + 1 : 0;

            tSuma += sensorT;
            hSuma += sensorH;

            // Mostrar lecturas sensores
            presencia = (sensorP == 1) ? " SI" : "NO";
            System.out.println("Lecturas actuales");
            System.out.println("\t- Temperatura: " + sensorT + "ºC");
            System.out.println("\t- Humedad: " + sensorH + "%");
            System.out.println("\t- Presencia: " + presencia);

            //Mostrar estadísticas
            System.out.println("Mostrar estadísticas");
            System.out.println("\t- Temperatura: Máxima " + tMaxima + "ºC, Mínima " + tMinima + "ºC, Promedio = " + tSuma / lecturas + "ºC");
            System.out.println("\t- Humedad: Máxima " + hMaxima + "%, Mínima " + hMinima + "%, Promedio = " + hSuma / lecturas + "%");

            //MostrarTotales
            System.out.println("Total Alarmas Generadas");
            System.out.println("\t -Temperatura: " + contAlarmasT);
            System.out.println("\t -Humedad: " + contAlarmasH);
            System.out.println("\t -Presencia: " + contAlarmasP);
            System.out.println();

            //Mostrar alarmas
            if (contAnomaliasT >= LECTURAS_ANOMALAS) {
                System.out.println("¡Alarma! Sensor de Temperatura activado\n");
                contAlarmasT++;
            }
            if (contAnomaliasH >= LECTURAS_ANOMALAS) {
                System.out.println("¡Alarma! Sensor de Humedad activado\n");
                contAlarmasH++;
            }
            if (contAnomaliasP >= LECTURAS_ANOMALAS) {
                System.out.println("¡Alarma! Sensor de Presencia activado\n");
                contAlarmasP++;
            }

            System.out.println();
            // Esperar
            Thread.sleep(SENSIBILIDAD);
        }
    }
}
