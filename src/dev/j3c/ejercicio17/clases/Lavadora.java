package dev.j3c.ejercicio17.clases;

public class Lavadora extends Electrodomestico{

    private double carga = 5;

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return this.carga;
    }

    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(this.carga > 30) precioFinal += 50;
        return precioFinal;
    }

}
