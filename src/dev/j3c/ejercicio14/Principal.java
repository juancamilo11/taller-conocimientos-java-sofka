package dev.j3c.ejercicio14;

import javax.swing.*;
import java.util.InputMismatchException;

public class Principal {

    private static Integer ingresarNumero() {
        Integer numero = null;   //Wrapper class (Autoboxing operation) - Clase envolvente
        do {
            try {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero menor que 1000: "));
            } catch (NumberFormatException e1) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e1.getMessage());
            } catch(InputMismatchException e2) {
                JOptionPane.showMessageDialog(null,"Excepción atrapada: " + e2.getMessage());
            }
        } while(numero == null);
        return numero;
    }

    private static void imprimirNumeros(int num) {
        System.out.println("\nEjercicio #14: Los números del " + num + " al 1000 con saltos de 2 en 2 son: ");
        for (int i=num ; i<=1000 ; i+=2) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Integer numero = Principal.ingresarNumero();
        if(numero < 1000) {
            Principal.imprimirNumeros(numero);
        } else {
            System.out.println("\nEjercicio #14: Ha ingresado un número inválido, debe ingresar un número menor que 1000");
        }
    }

}
