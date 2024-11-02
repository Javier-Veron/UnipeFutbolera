package com.example.unipefutbolera;

public class PartidoGanado extends ResultadoPartido{

    int puntos = 3;
    double fanaticos = 1.2;

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
