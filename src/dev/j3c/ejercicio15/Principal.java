package dev.j3c.ejercicio15;

import javax.swing.*;

public class Principal {

    private static void mostrarMenu() {
        char opcElegida ='0';
        do {
            try {
                opcElegida = JOptionPane.showInputDialog("****** GESTION CINEMATOGRÁFICA ********\n" +
                        "\t1-NUEVO ACTOR\n" +
                        "\t2-BUSCAR ACTOR\n" +
                        "\t3-ELIMINAR ACTOR\n" +
                        "\t4-MODIFICAR ACTOR\n" +
                        "\t5-VER TODOS LOS ACTORES\n" +
                        "\t6-VER PELICULAS DE LOS ACTORES\n" +
                        "\t7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n" +
                        "\t8-SALIR\n").charAt(0);
            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Excepción atrapada: " + e.getMessage());
            }
            if(opcElegida < '1' || opcElegida > '8') JOptionPane.showMessageDialog(null,"Opción Incorrecta, intente nuevamente.");
        } while(opcElegida != '8');
    }

    public static void main() {
        Principal.mostrarMenu();
    }
}
