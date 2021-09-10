package dev.j3c.ejercicio16.enums;

public enum ELetrasDNI {

    letraT(0,'T'),letraR(1,'R'),letraW(2,'W'),letraA(3,'A'),
    letraG(4,'G'),letraM(5,'M'),letraY(6,'Y'),letraF(7,'F'),
    letraP(8,'P'),letraD(9,'D'),letraX(10,'X'),letraB(11,'B'),
    letraN(12,'N'),letraJ(13,'J'),letraZ(14,'Z'),letraS(15,'S'),
    letraQ(16,'Q'),letraV(17,'V'),letraH(18,'H'),letraL(19,'L'),
    letraC(20,'C'),letraK(21,'K'),letraE(22,'E');

    private int numero;
    private char letra;

    ELetrasDNI(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public int getNumero() {
        return this.numero;
    }

    public char getLetra() {
        return this.letra;
    }

    public static char getLetraConNumero(int numero) {
        ELetrasDNI[] vecLetrasDNI = ELetrasDNI.values();
        char letraRetorno = ' ';
        for (int i = 0 ; i < vecLetrasDNI.length ; i++) {
            if(vecLetrasDNI[i].getNumero() == numero) {
                letraRetorno = vecLetrasDNI[i].getLetra();
            }
        }
        return letraRetorno;
    }
}

