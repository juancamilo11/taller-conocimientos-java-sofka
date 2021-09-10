package dev.j3c.ejercicio17.enums;

public enum EColoresElectrod {
    colorBlanco("blanco"),
    colorNegro("negro"),
    colorRojo("rojo"),
    colorAzul("azul"),
    colorGris("gris");

    private String color;

    EColoresElectrod(String color) {
        this.color = color;
    }

    public static EColoresElectrod getColorElectrod(String color) {
        EColoresElectrod[] vecColores = EColoresElectrod.values();
        EColoresElectrod colorRetorno = null;
        for (int i = 0 ; i < vecColores.length ; i++) {
            if(vecColores[i].getColor().equalsIgnoreCase(color)) {
                colorRetorno = vecColores[i];
            }
        }
        return colorRetorno;
    }

    public String getColor() {
        return color;
    }

    public boolean verificarColor(String color) {
        EColoresElectrod[] vecColores = EColoresElectrod.values();
        boolean colorValido = false;
        for (int i = 0 ; i < vecColores.length && !colorValido ; i++) {
            if(vecColores[i].getColor().equalsIgnoreCase(color)) {
                colorValido = true;
            }
        }
        return colorValido;
    }
}
