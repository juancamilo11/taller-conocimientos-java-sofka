package dev.j3c.ejercicio2;

import javax.swing.*;
import java.util.InputMismatchException;

public class Principal {

    private static double ingresarNumero() {
        Double numero = null;   //Wrapper class (Autoboxing operation) - Clase envolvente
        do {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e2.getMessage());
            }
        } while(numero == null);
        return(numero);
    }

    private static String compararNumerosIngresados(double primerNum, double segundoNum) {
        double diferencia = primerNum - segundoNum;
        String resultado = "El primer número: " + primerNum + " y el segundo número: " + segundoNum + " son iguales";
        if(diferencia > 0) {
            resultado = "El primer número: " + primerNum + " es mayor que el segundo número: " + segundoNum;
        } else if (diferencia < 0) {
            resultado = "El primer número: " + primerNum + " es menor que el segundo número: " + segundoNum;
        }
        return resultado;
    }

    public static void main() {
        double primerNumero = Principal.ingresarNumero();
        double segundoNumero = Principal.ingresarNumero();
        JOptionPane.showMessageDialog(null, Principal.compararNumerosIngresados(primerNumero, segundoNumero));
    }


}
