package dev.j3c.ejercicio8;

import javax.swing.*;

public class Principal {

    private static String ingresarDiaDeLaSemana() {
        String diaDeLaSemana = JOptionPane.showInputDialog("Ingrese un día de la semana: ");
        return(diaDeLaSemana);
    }

    private static String getTipoDeDia(String diDeLaSemana) {
        String mensaje;
        switch(diDeLaSemana.toLowerCase()) {
            case "lunes":     mensaje = "Lunes es un día laboral";      break;
            case "martes":    mensaje = "Martes es un día laboral";     break;
            case "miercoles": mensaje = "Miercoles es un día laboral";  break;
            case "jueves":    mensaje = "Jueves es un día laboral";     break;
            case "viernes":   mensaje = "Viernes es un día laboral";    break;
            case "sabado":    mensaje = "Sabado NO es un día laboral";  break;
            case "domingo":   mensaje = "Domingo NO es un día laboral"; break;
            default:          mensaje = "Día ingresado no válido";      break;
        }
        return mensaje;
    }

    public static void main() {
        String diaDeLaSemana = Principal.ingresarDiaDeLaSemana();
        System.out.println("\nEjercicio #8: " + Principal.getTipoDeDia(diaDeLaSemana));
    }


}
