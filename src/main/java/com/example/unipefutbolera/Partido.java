package com.example.unipefutbolera;

public class Partido {

    String equipo1,equipo2;
    ResultadoPartido resultado1, resultado2;

    public Partido(String equipo1, String equipo2){

        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado1 = null;
        this.resultado2 = null;

    }

    public Partido(String equipo1, String equipo2, ResultadoPartido resultado1, ResultadoPartido resultado2){

        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado1 = resultado1;
        this.resultado2 = resultado2;

    }


    //GETTERS AND SETTERS

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public ResultadoPartido getResultado1() {
        return resultado1;
    }

    public void setResultado1(ResultadoPartido resultado1) {
        this.resultado1 = resultado1;
    }

    public ResultadoPartido getResultado2() {
        return resultado2;
    }

    public void setResultado2(ResultadoPartido resultado2) {
        this.resultado2 = resultado2;
    }
}
