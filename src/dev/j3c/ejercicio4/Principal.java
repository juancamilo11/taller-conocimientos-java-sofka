package dev.j3c.ejercicio4;

import javax.swing.*;
import java.util.InputMismatchException;

public class Principal {

    private static double ingresarPrecio() {
        Double precio = null;   //Wrapper class (Autoboxing operation) - Clase envolvente
        do {
            try {
                precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un precio para calcular el precio total al sumarle su IVA: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e2.getMessage());
            }
        } while(precio == null || precio < 0);
        return(precio);
    }

    private static double calcularPrecioFinal(double precio) {
        return (precio + (precio * 0.21));
    }

    public static void main(String[] args) {
        double precio = Principal.ingresarPrecio();
        JOptionPane.showMessageDialog(null, "El precio final al sumarle el IVA es: $" + Principal.calcularPrecioFinal(precio));
    }


}
