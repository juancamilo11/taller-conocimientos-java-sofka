package dev.j3c.ejercicio12;

import javax.swing.*;
import java.util.Scanner;

public class Principal {

    private static String ingresarPalabra() {
        String palabra = JOptionPane.showInputDialog(null,"Ingrese una palabra: ");
        return palabra;
    }

    public static void compararPalabras(String primeraPalabra, String segundaPalabra) {
        if(primeraPalabra.equals(segundaPalabra)){
            System.out.println("\nEjercicio #12: Las palabras ingresadas son iguales");
        } else {
            int minLength = Math.min(primeraPalabra.length(), segundaPalabra.length());
            System.out.println("\nEjercicio #12: Comparación de las palabras:");
            for (int index = 0; index < minLength; index++) {
                if (primeraPalabra.charAt(index) != segundaPalabra.charAt(index)) {
                    System.out.println("\nEn el caracter número " + (index + 1) + ", las letras son diferentes: ");
                    System.out.println("\tEn la primera palabra hay un: '" + primeraPalabra.charAt(index) + "'");
                    System.out.println("\tEn la segunda palabra hay un: '" + segundaPalabra.charAt(index) + "'");
                }
            }
        }
    }

    public static void main() {
        String primeraPalabra = Principal.ingresarPalabra();
        String segundaPalabra = Principal.ingresarPalabra();
        if(primeraPalabra.length() > 0 && segundaPalabra.length() > 0) {
            Principal.compararPalabras(primeraPalabra,segundaPalabra);
        } else {
            System.out.println("\nEjercicio #12: Ingrese palabras válidas para compararlas.");
        }
    }

}
