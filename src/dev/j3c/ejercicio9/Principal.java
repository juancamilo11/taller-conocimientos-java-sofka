package dev.j3c.ejercicio9;

public class Principal {

    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        frase = frase.replace('a','e');
        frase += ", y la buena actitud será tu mejor arma contra los momentos difíciles.";
        System.out.println("\nEjercicio #9: " + frase);
    }
}
