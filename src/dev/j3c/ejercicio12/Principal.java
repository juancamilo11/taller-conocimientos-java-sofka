package dev.j3c.ejercicio12;

import java.util.Scanner;

public class MainClass {

    private static String ingresarPalabra() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String sentence = reader.nextLine();
        return sentence;
    }

    public static void compararPalabras(String primeraPalabra, String segundaPalabra) {
        if(primeraPalabra.equals(segundaPalabra)){
            System.out.println("Las palabras ingresadas son iguales");
        } else {
            int minLength = Math.min(primeraPalabra.length(), segundaPalabra.length());
            for (int index = 0; index < minLength; index++) {
                if (primeraPalabra.charAt(index) != segundaPalabra.charAt(index)) {
                    System.out.println("\nEn el caracter número " + (index + 1) + ", las letras son diferentes: ");
                    System.out.println("\tEn la primera palabra hay un: '" + primeraPalabra.charAt(index));
                    System.out.println("\tEn la segunda palabra hay un: '" + segundaPalabra.charAt(index));
                }
            }
        }
    }

    public static void main(String[] args) {
        String firstWord = MainClass.ingresarPalabra();
        String secondWord = MainClass.ingresarPalabra();
        if(firstWord.length() > 0 && secondWord.length() > 0) {
            MainClass.compararPalabras(firstWord,secondWord);
        } else {
            System.out.println("Ingrese una cadena válida.");
        }
    }

}
