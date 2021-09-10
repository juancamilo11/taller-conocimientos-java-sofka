package dev.j3c.ejercicio18;

import dev.j3c.ejercicio18.clases.Serie;
import dev.j3c.ejercicio18.clases.Videojuego;

import java.util.Arrays;

public class Principal {

    private static void llenarArregloSeries(Serie[] vecSeries) {
        vecSeries[0] = new Serie("The queen of flow", 8, "Accion",  "Peter Smith");
        vecSeries[1] = new Serie("Dark night", "Jack Paterson");
        vecSeries[2] = new Serie("Suits", 25, "Terror", "Sarah Colemman");
        vecSeries[3] = new Serie("Crepusculo", "Mike Johnson");
        vecSeries[4] = new Serie("Girl from nowhere", 5, "Comedia", "Alina Williams");
    }

    private static void llenarArregloVideojuegos(Videojuego[] vecVideojuegos) {
        vecVideojuegos[0] = new Videojuego("FIFA 2020", 10);
        vecVideojuegos[1] = new Videojuego("GTA V", 3, "Accion", "Epig Games");
        vecVideojuegos[2] = new Videojuego("Call Of Duty", 2);
        vecVideojuegos[3] = new Videojuego("Ride III", 40, "Motociclismo", "RideVideoGame");
        vecVideojuegos[4] = new Videojuego("Need for Speed", 4);
    }

    private static void entregarVideojuegos(Videojuego[] vecVideojuegos) {
        vecVideojuegos[0].entregar();
        vecVideojuegos[2].entregar();
        vecVideojuegos[4].entregar();
    }

    private static void entregarSeries(Serie[] vecSeries) {
        vecSeries[1].entregar();
        vecSeries[2].entregar();
    }

    private static void contarYDevolverVideojuegos(Videojuego[] vecVideojuegos) {
        int numVideojuegosEntregados = 0;
        for (int i = 0; i < vecVideojuegos.length; i++) {
            if(vecVideojuegos[i].isEntregado()) {
                vecVideojuegos[i].devolver();
                numVideojuegosEntregados++;
            }
        }
        System.out.println("\nSe han devuelto " + numVideojuegosEntregados + " videojuegos que se habían entregado anteriormente.");
    }

    private static void contarYDevolverSeries(Serie[] vecSeries) {
        int numSeriesEntregadas = 0;
        for (int i = 0; i < vecSeries.length; i++) {
            if(vecSeries[i].isEntregado()) {
                vecSeries[i].devolver();
                numSeriesEntregadas++;
            }
        }
        System.out.println("\nSe han devuelto " + numSeriesEntregadas + " series que se habían entregado anteriormente.");
    }

    private static void serieMasTemporadas(Serie[] vecSeries) {
        Arrays.sort(vecSeries);
        System.out.println("\nLa serie con más temporadas es: " + vecSeries[0]);
    }

    private static void videoJuegoMasHEstimadas(Videojuego[] vecVideojuegos) {
        Arrays.sort(vecVideojuegos);
        System.out.println("El videojuego con más horas estimadas es: " + vecVideojuegos[0]);
    }

    public static void main() {
        Serie[] vecSeries = new Serie[5];
        Videojuego[] vecVideojuegos = new Videojuego[5];

        Principal.llenarArregloSeries(vecSeries);
        Principal.llenarArregloVideojuegos(vecVideojuegos);

        Principal.entregarSeries(vecSeries);
        Principal.entregarVideojuegos(vecVideojuegos);

        System.out.println("\nEjercicio #18: ");
        Principal.contarYDevolverSeries(vecSeries);
        Principal.contarYDevolverVideojuegos(vecVideojuegos);

        Principal.serieMasTemporadas(vecSeries);
        Principal.videoJuegoMasHEstimadas(vecVideojuegos);
    }
}
