package dev.j3c.ejercicio5;

public class Principal {

    public static void main() {
        int num = 2;
        System.out.println("\nEjercicio #5: (Ciclo while) La lista de los números impares del 1 al 100, con ambos incluidos es: ");
        System.out.print("1" + " ");
        while (num < 100) {
            if(num %2 != 0) {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.print("100" + " ");
    }


}
