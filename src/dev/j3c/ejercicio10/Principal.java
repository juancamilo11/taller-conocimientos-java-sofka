package dev.j3c.practice10;

import java.util.Scanner;

public class MainClass {

    private static String inputSentence() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingrese una frase para eliminarle los espacios: ");
        String quote = reader.nextLine();
        return (quote);
    }

    private static String removeBlanks(String dayOfTheWeek) {
        String sentenceNoBlanks = dayOfTheWeek.replaceAll("\\s", ""); //  \\s --> Any blank
        return sentenceNoBlanks;
    }

    public static void main(String[] args) {
        String sentence = MainClass.inputSentence();
        if(sentence.length() > 0) {
            System.out.println("La oración ingresada, ahora sin espacios es: " + MainClass.removeBlanks(sentence));
        } else {
            System.out.println("Ingrese una cadena válida.");
        }
    }

}
