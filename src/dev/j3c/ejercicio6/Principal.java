package dev.j3c.ejercicio6;

public class Principal {
    
    public static void main() {
        System.out.println("\nEjercicio #6: (Ciclo for) La lista de los números impares del 1 al 100, con ambos incluidos es:");
        System.out.print("1" + " ");
        for (int num = 3 ; num < 100 ; num++) {
            if(num%2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.print("100" + " ");
    }


}
