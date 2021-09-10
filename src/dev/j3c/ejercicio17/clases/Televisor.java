package dev.j3c.practice17.clases;

public class Televisor extends Electrodomestico{

    private double resolucion = 20;
    private boolean sintonizadorTDT = false;

    public Televisor() {
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, double resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public double getResolucion() {
        return this.resolucion;
    }

    public boolean isSintonizadorTDT() {
        return this.sintonizadorTDT;
    }

    public double precioFinal() {
        double precioFinal = super.precioFinal();
        if(this.resolucion > 40) precioFinal += precioFinal * 0.3;
        if(this.sintonizadorTDT) precioFinal += 50;
        return precioFinal;
    }
}
