package dev.j3c.ejercicio17.enums;

public enum ETamanio {
    tamanio0y19(0,19,10),
    tamanio20y49(20,49,50),
    tamanio50y79(50,79,80),
    tamanioMayorA80(80,Double.POSITIVE_INFINITY,100);

    private double min, max, precioAsociado;

    ETamanio(double min, double max, double precioAsociado) {
        this.min = min;
        this.max = max;
        this.precioAsociado = precioAsociado;
    }

    public static double getPrecioPorTamanio(double peso) {
        ETamanio[] vecTamanios = ETamanio.values();
        double aumento = vecTamanios[0].getPrecioAsociado();
        for (int i = 0 ; i < vecTamanios.length; i++) {
            if(vecTamanios[i].getMin() < peso && vecTamanios[i].getMax() > peso) {
                break;
            }
        }
        return aumento;
    }

    public double getMin() {
        return this.min;
    }

    public double getMax() {
        return this.max;
    }

    public double getPrecioAsociado() {
        return this.precioAsociado;
    }
}
