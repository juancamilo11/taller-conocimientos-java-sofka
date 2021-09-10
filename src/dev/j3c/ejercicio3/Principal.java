package dev.j3c.ejercicio3;

import javax.swing.*;
import java.util.InputMismatchException;

public class Principal {

    private static double ingresarRadio() {
        Double radio = null;   //Wrapper class (Autoboxing operation)
        do {
            try {
                radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del radio para calcular su área: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e2.getMessage());
            }
        } while(radio == null || radio < 0);
        return(radio);
    }

    private static double calcularArea(double radio) {
        return (Math.PI * Math.pow(radio,2));
    }

    public static void main() {
        double radio = Principal.ingresarRadio();
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + Principal.calcularArea(radio) + " m^2");
    }


}
