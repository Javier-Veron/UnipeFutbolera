package com.example.unipefutbolera;

public class PartidoEmpatado extends ResultadoPartido{

    //Atributos

    private int puntos = 1;
    private double fanaticos = 0.95;

    //Consultas

    public int puntos(){
        return puntos;
    }
    public double fanaticos(){
        return fanaticos;
    }

    //GETTERS AND SETTERS
    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public double getFanaticos() {
        return fanaticos;
    }

    public void setFanaticos(double fanaticos) {
        this.fanaticos = fanaticos;
    }
}


