package dev.j3c.ejercicio16.utilidades;

import javax.swing.*;
import java.util.InputMismatchException;

public class utilidades {

    public static String ingresarNombre() {
        String nombre;
        do{
            nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        } while(nombre == null || nombre.length() == 0);
        return nombre;
    }

    public static int ingresarEdad() {
        Integer edad = null;   //Wrapper class (Autoboxing operation) - Clase envolvente
        do {
            try {
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e2.getMessage());
            }
        } while(edad == null || edad < 0);
        return(edad);
    }

    public static char ingresarGenero() {
        Character genero = null;   //Wrapper class (Autoboxing operation) - Clase envolvente
        do {
            try {
                genero = JOptionPane.showInputDialog("Ingrese el sexo (H para nombre, M para mujer): ").charAt(0);
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e1.getMessage());
            } catch(Exception e2) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e2.getMessage());
            }
        } while(genero == null || ( genero != 'H' && genero != 'M'));
        return(genero);
    }

    public static double ingresarCantidadDecimal(String titulo) {
        Double pesoOEstatura = null;   //Wrapper class (Autoboxing operation) - Clase envolvente
        do {
            try {
                pesoOEstatura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese una valor para " + titulo +": "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Exception caught: " + e2.getMessage());
            }
        } while(pesoOEstatura == null || pesoOEstatura < 0);
        return(pesoOEstatura);
    }

}
