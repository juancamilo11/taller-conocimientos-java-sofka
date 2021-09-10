package dev.j3c.ejercicio10;

import javax.swing.*;

public class Principal {

    private static String ingresarFrase() {
        String frase = JOptionPane.showInputDialog("Ingrese una frase para eliminarle los espacios: ");
        return frase;
    }

    private static String eliminarEspacios(String frase) {
        String fraseSinEspacios = frase.replaceAll("\\s", ""); //  \\s --> Elimina cualquier espacio
        return fraseSinEspacios;
    }

    public static void main() {
        String frase = Principal.ingresarFrase();
        if(frase.length() > 0) {
            System.out.println("\nEjercicio #10: La oración ingresada: " + frase + ", ahora sin espacios es: " + Principal.eliminarEspacios(frase));
        } else {
            System.out.println("\nEjercicio #10: Ingrese una cadena válida.");
        }
    }

}
