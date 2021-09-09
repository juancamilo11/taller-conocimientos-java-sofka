package dev.j3c.ejercicio1;

import javax.swing.*;

public class Principal {

    private static String compararNumeros(double primerNum, double segundoNum) {
        double difference = primerNum - segundoNum;
        String result = "El primer número: " + primerNum + " y el segundo número: " + segundoNum + " son iguales.";
        if(difference > 0) {
            result = "El primer número: " + primerNum + " es mayor que el segundo: " + segundoNum;
        } else if (difference < 0) {
            result = "El primer número: " + primerNum + " es menor que el segundo número: " + segundoNum;
        }
        return result;
    }

    public static void main(String[] args) {
        double primerNumero = 10.4,
                segundoNumero = -3.23;
        JOptionPane.showMessageDialog(null, Principal.compararNumeros(primerNumero, segundoNumero));
    }


}
