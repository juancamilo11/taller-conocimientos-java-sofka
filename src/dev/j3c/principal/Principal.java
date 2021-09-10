package dev.j3c.principal;


import javax.swing.*;

public class Principal {

    private static char mostrarMenu() {
        char opcElegida ='0';
        do {
            try {
                opcElegida = JOptionPane.showInputDialog("****** Menú Principal ********\n" +
                        "\ta. Ejercicio 1: Comparar dos números (Constantes).\n" +
                        "\tb. Ejercicio 2: Comparar dos números ingresados por teclado.\n" +
                        "\tc. Ejercicio 3: Calcular área de un círculo ingresado por teclado.\n" +
                        "\td. Ejercicio 4: Calcular IVA a un precio ingresado por teclado.\n" +
                        "\te. Ejercicio 5: Imprimir numeros impares del 1 al 100 (Ciclo while).\n" +
                        "\tf. Ejercicio 6: Imprimir numeros impares del 1 al 100 (Ciclo for).\n" +
                        "\tg. Ejercicio 7: Validar que un número ingresado sea mayor que 0.\n" +
                        "\th. Ejercicio 8: Consultar si un día es laboral o no laboral.\n" +
                        "\ti. Ejercicio 9: Cambiar vocales de una frase y concatenarle texto.\n" +
                        "\tj. Ejercicio 10: Remover espacios en una frase ingresada por teclado.\n" +
                        "\tk. Ejercicio 11: Contar vocales y obtener logitud de cadena ingresada por teclado. \n" +
                        "\tl. Ejercicio 12: Comparar dos palabras ingresadas por teclado.\n" +
                        "\tm. Ejercicio 13: Consultar la fecha actual.\n" +
                        "\tn. Ejercicio 14: Hallar los números desde n hasta 1000 de 2 en 2.\n" +
                        "\to. Ejercicio 15: Mostrar menú opcion 8 salir.\n" +
                        "\tp. Ejercicio 16: Ejercicio con la clase Persona.\n" +
                        "\tq. Ejercicio 17: Ejercicio con las clases Electrodomestico, Nevera y Televisor.\n" +
                        "\tr. Ejercicio 18: Ejercicio con las clases Serie y Videojuego.\n" +
                        "\ts. Salir.").charAt(0);

            }catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Excepción atrapada: " + e.getMessage());
            }
            if(opcElegida < 'a' || opcElegida > 's') JOptionPane.showMessageDialog(null,"Opción Incorrecta, intente nuevamente.");
        } while(opcElegida < 'a' || opcElegida > 's');
        return opcElegida;
    }

    public static void main(String[] args) {

    }
}
