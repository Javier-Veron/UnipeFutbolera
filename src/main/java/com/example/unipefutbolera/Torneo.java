package com.example.unipefutbolera;

import java.util.ArrayList;

public class Torneo {

    ArrayList<Equipo> equiposInscriptos = new ArrayList<Equipo>();

    ArrayList<Fecha>  fechasSorteadas = new ArrayList<Fecha>();

    public void inscribirEquipo(Equipo equipo){

        equiposInscriptos.add(equipo);

    }

    public Equipo conMayorCantidadFanaticos(){
        Equipo resultado = null;

        for(Equipo e:equiposInscriptos){
            if (resultado==null){
                resultado = e;
            }

            if (resultado.calcularFanaticos() < e.calcularFanaticos()){
                resultado = e;
            }

        }

        return resultado;

    }

    public Equipo conMenorCantidadFanaticos(){
        Equipo resultado = null;

        for(Equipo e:equiposInscriptos){
            if (resultado==null){
                resultado = e;
            }

            if (resultado.calcularFanaticos() > e.calcularFanaticos()){
                resultado = e;
            }

        }

        return resultado;
    }

    public Equipo equipoGanador(){
        Equipo resultado = null;

        for(Equipo e:equiposInscriptos){
            if (resultado==null){
                resultado = e;
            }

            if (resultado.calcularPuntaje() > e.calcularPuntaje()){
                resultado = e;
            }
        }
        return resultado;
    }

    public int cantidadZurdosTorneo(){
        int resultado=0;
        for(Equipo e : equiposInscriptos){
            resultado += e.cantidadZurdos();
        }
        return resultado;

    }

    public Equipo equipoConMasEmpates(){
        Equipo resultado = null;
        for(Equipo e: equiposInscriptos){
            if (resultado == null){
                resultado = e;
            }
            if (resultado.cantidadEmpates() < e.cantidadEmpates()) {
                resultado = e;
            }
        }
        return resultado;
    }



    /*public void sortearPartidos(){
        ArrayList<Partido>  combinacionDePartidosPosibles = new ArrayList<Partido>();
        for(Equipo e: equiposInscriptos){
            for(int i=0;i<equiposInscriptos.size();i++){
                Partido fechaPosible = new Partido(e.getNombre(), equiposInscriptos.get(i).getNombre());

                if (!fechaPosible.equipo1.equals(fechaPosible.equipo2)){
                    combinacionDePartidosPosibles.add(fechaPosible);
                }
            }
        }

        for (int i=0; i<combinacionDePartidosPosibles.size();i++){

            if (combinacionDePartidosPosibles.get(i).equipo1 || combinacionDePartidosPosibles.get(i).equipo2)

        }




    }*/


}
