package com.example.unipefutbolera;

public abstract class Jugador {

    //ATRIBUTOS

    private String nombre, apellido;
    private int fuerzaDeTiro;
    private double altura;
    private boolean esZurdo;


    //Metodo Abstracto

    public abstract float chanceDeHacerGol();
    public abstract float chanceGolDeCabeza();
    public abstract String rolJugador();
    public abstract int calcularPuntosDeAtaque();

    //GETTERS AND SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getFuerzaDeTiro() {
        return fuerzaDeTiro;
    }

    public void setFuerzaDeTiro(int fuerzaDeTiro) {
        this.fuerzaDeTiro = fuerzaDeTiro;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean esZurdo() {
        return esZurdo;
    }

    public void setEsZurdo(boolean esZurdo) {
        this.esZurdo = esZurdo;
    }


}
