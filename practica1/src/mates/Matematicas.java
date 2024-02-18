package mates;

import java.util.Random;

public class Matematicas {


    public static double generarNumeroPiIterativo(long pasos) {
        Random rand = new Random();
        long dentroCirculo = 0;

        for (long i = 0; i < pasos; i++) {
            double x = rand.nextDouble(); 
            double y = rand.nextDouble(); 
            double distanciaAlOrigen = Math.sqrt(x * x + y * y); 

            if (distanciaAlOrigen <= 1) {
                dentroCirculo++;
            }
        }


        double proporcion = (double) dentroCirculo / pasos;

        return 4 * proporcion;
    }
}
