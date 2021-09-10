package dev.j3c.ejercicio7;

import javax.swing.*;
import java.util.InputMismatchException;

public class Principal {

    private static double ingresarNumero() {
        Double numero = null;   //Wrapper class (Autoboxing operation) - Clase envolvente
        do {
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número para verificar si es mayor a cero: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e2.getMessage());
            }
        } while(numero == null);
        return(numero);
    }

    private static boolean esMayorQueCero(double numero) {
        return (numero >= 0) ? true: false;
    }

    public static void main() {
        Double numero;
        do {
            numero = Principal.ingresarNumero();
            if(!Principal.esMayorQueCero(numero)) JOptionPane.showMessageDialog(null,numero + " es menor que cero, ingrese otro número.");
        } while(numero == null || !Principal.esMayorQueCero(numero));
        System.out.println("\nEjercicio #7: El número: " + numero + " es válido, ya que es mayor a cero.");
    }


}
