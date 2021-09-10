package dev.j3c.ejercicio16;

import dev.j3c.ejercicio16.clases.Persona;
import dev.j3c.ejercicio16.utilidades.Utilidades;

public class Principal {

    private static String getMensajePorIMC(int imc) {
        String mensaje = "";
        switch (imc) {
            case 1:
                mensaje = "Tienes sobrepeso.";
                break;
            case 0:
                mensaje = "Estás por debajo de tu peso ideal.";
                break;
            case -1:
                mensaje = "Tienes un peso ideal.";
                break;
            default:
                mensaje = "Error en el cálculo del IMC.";
                break;
        }
        return mensaje;
    }

    private static void getInfoPersona(Persona persona) {
        System.out.println("La información de la persona es " + persona.toString());
        System.out.println("El DNI de la persona indica: " + Principal.getMensajePorIMC(persona.calcularIMC()));
        System.out.println("La persona es " + ((persona.esMayorDeEdad())? "Mayor de edad" : "Menor de edad") + "\n");
    }

    public static void main(String[] args) {
        String nombre = Utilidades.ingresarNombre();
        int edad = Utilidades.ingresarEdad();
        char genero = Utilidades.ingresarGenero();
        double peso = Utilidades.ingresarCantidadDecimal("el peso");
        double altura = Utilidades.ingresarCantidadDecimal("la estatura");

        Persona persona1 = new Persona(nombre, edad, genero, peso, altura);
        System.out.println("\nEjercicio #16: Para la primera persona: ");
        getInfoPersona(persona1);

        Persona persona2 = new Persona(nombre, edad, genero);
        System.out.println("\nEjercicio #16: Para la segunda persona: ");
        getInfoPersona(persona2);

        Persona persona3 = new Persona();
        persona3.setNombre(nombre);
        persona3.setEdad(edad);
        persona3.setSexo(genero);
        persona3.setPeso(peso);
        persona3.setAltura(altura);
        System.out.println("\nEjercicio #16: Para la tercera persona: ");
        getInfoPersona(persona3);
    }
}
