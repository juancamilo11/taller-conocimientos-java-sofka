package dev.j3c.ejercicio11;

import javax.swing.*;

public class Principal {

    private static String ingresarOracion() {
        String frase = JOptionPane.showInputDialog(null,"Ingrese una frase para contar sus caracteres y contar sus vocales: ");
        return frase;
    }

    public static int contarVocal(String frase, char vocal) {
        int conteo = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == vocal) {
                conteo++;
            }
        }
        return conteo;
    }

    public static void main(String[] args) {
        String frase = Principal.ingresarOracion();
        if(frase.length() > 0) {
            System.out.println("\nEjercicio #11: La longitud de la cadena es, incluyendo los espacios es: " + frase.length());
            System.out.println("La cantidad de 'a' en la cadena es: " + Principal.contarVocal(frase,'a'));
            System.out.println("La cantidad de 'e' en la cadena es: " + Principal.contarVocal(frase,'e'));
            System.out.println("La cantidad de 'i' en la cadena es: " + Principal.contarVocal(frase,'i'));
            System.out.println("La cantidad de 'o' en la cadena es: " + Principal.contarVocal(frase,'o'));
            System.out.println("La cantidad de 'u' en la cadena es: " + Principal.contarVocal(frase,'u'));
        } else {
            System.out.println("\nEjercicio #11: Ingrese una cadena válida.");
        }
    }

}
