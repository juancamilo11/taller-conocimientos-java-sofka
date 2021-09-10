package dev.j3c.practice17.enums;

public enum EPreciosConsEnerg {
    precioTipoA('A',100),
    precioTipoB('B',80),
    precioTipoC('C',60),
    precioTipoD('D',50),
    precioTipoE('E',30),
    precioTipoF('F',10);

    private double precioAsociado;
    private char letra;

    EPreciosConsEnerg(char letra,double precioAsociado) {
        this.letra = letra;
        this.precioAsociado = precioAsociado;
    }

    public char getLetra() {
        return this.letra;
    }

    public double getPrecioAsociado() {
        return this.precioAsociado;
    }

    public boolean verificarConsumo(char letra) {
        EPreciosConsEnerg[] vecPrecios = EPreciosConsEnerg.values();
        boolean letraValida = false;
        for (int i = 0 ; i < vecPrecios.length && !letraValida ; i++) {
            if(vecPrecios[i].getLetra() == letra) {
                letraValida = true;
            }
        }
        return letraValida;
    }

    public static EPreciosConsEnerg getPrecioPorLetra(char letra) {
        EPreciosConsEnerg[] vecPrecios = EPreciosConsEnerg.values();
        EPreciosConsEnerg precioRetorno = null;
        for (int i = 0 ; i < vecPrecios.length ; i++) {
            if(vecPrecios[i].getLetra() == letra) {
                precioRetorno = vecPrecios[i];
            }
        }
        return precioRetorno;
    }
}
