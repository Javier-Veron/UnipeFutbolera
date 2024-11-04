package com.example.unipefutbolera;

import java.util.ArrayList;

public class Fecha {

    ArrayList<Partido> partidos = new ArrayList<Partido>();


    public void jugarFecha(){
        for(Partido p: partidos){
            p.jugarPartido();
        }
    }

    public void agregarPartido(Equipo equipo1,Equipo equipo2){
        Partido nuevoPartido = new Partido(equipo1,equipo2);
        partidos.add(nuevoPartido);
    }

    public boolean fechaCerrada(){
        for(Partido p: partidos){
            if((p.resultado1 == null)  || (p.resultado2 == null)){
                return false;
            }

        }
        return true;
    }

    public int contadorDeEmpates(){
        int resultado = 0;
        if(fechaCerrada()){
            for(Partido p: partidos){
                if((p.resultado1.getClass() == PartidoEmpatado.class)  || p.resultado2.getClass() == PartidoEmpatado.class){
                    resultado += 1;
                }
            }
        }

        return resultado;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }
}
