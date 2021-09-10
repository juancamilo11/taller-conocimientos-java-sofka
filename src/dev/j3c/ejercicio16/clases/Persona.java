package dev.j3c.ejercicio16.clases;

import dev.j3c.ejercicio16.enums.ELetrasDNI;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private char sexo = 'H';
    private double peso;
    private double altura;

    public Persona() {
        this.generarDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.generarDNI();
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.generarDNI();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private boolean isDNIValid(int randomDNI) {
        return (String.valueOf(randomDNI).length() == 8) ? true : false;
    }

    private char getLetraDNI(int numMod23) {
        return ELetrasDNI.getLetraConNumero(numMod23);
    }

    private String generarDNICompleto(int numRandom){
        int numMod23 = numRandom % 23;
        return numRandom + String.valueOf(this.getLetraDNI(numMod23));
    }

    private void generarDNI(){
        int numRandom;
        do {
            numRandom = (int)(Math.random() * 100000000);
        } while(!isDNIValid(numRandom));
        this.DNI = this.generarDNICompleto(numRandom);
    }

    public int calcularIMC(){
        double imc =  this.peso/(Math.pow(this.altura,2));
        int result;
        if(imc < 20) {
            result = -1;
        } else if(imc>=20 && imc<=25) {
            result = 0;
        } else {
            result = 1;
        }
        return(result);
    }

    public boolean esMayorDeEdad(){
        return (this.edad >= 18 ) ? true : false;
    }

    private void comprobarSexo(char sexo){
        if(this.sexo != sexo) {
            this.sexo = 'H';
        }
    }

    @Override
    public String toString() {
        return "Persona[" +
                "nombre='" + nombre +
                ", edad=" + edad +
                ", DNI='" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                ']';
    }
}
