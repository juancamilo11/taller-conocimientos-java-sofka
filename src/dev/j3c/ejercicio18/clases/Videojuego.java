package dev.j3c.ejercicio18.clases;

import dev.j3c.ejercicio18.interfaces.Entregable;

public class Videojuego implements Entregable, Comparable<Object>{

    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compania;

    public Videojuego(){
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return this.horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return this.compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego[" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                ']';
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        if(this.horasEstimadas > ((Videojuego)a).getHorasEstimadas()) {
            return -1;
        } else if(this.horasEstimadas < ((Videojuego) a).getHorasEstimadas()) {
            return 1;
        }
        return 0;
    }
}
