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

    public void sortearPartidos(){
        ArrayList<Partido>  combinacionDePartidosPosibles = new ArrayList<Partido>();
        for(Equipo e: equiposInscriptos){
            for (Equipo equiposInscripto : equiposInscriptos) {
                Partido posiblePartido = new Partido(e, equiposInscripto);

                if (!posiblePartido.equipo1.equals(posiblePartido.equipo2)) {
                    combinacionDePartidosPosibles.add(posiblePartido);
                }
            }
        }

        int tamanioListaCombinaciones = combinacionDePartidosPosibles.size();

        while(tamanioListaCombinaciones>0) {

            Fecha fecha = new Fecha();
            ArrayList<Integer> partidosAQuitar = new ArrayList<Integer>();

            for (int i = 0; i < combinacionDePartidosPosibles.size(); i++) {
                Equipo equipo1 = combinacionDePartidosPosibles.get(i).equipo1;
                Equipo equipo2 = combinacionDePartidosPosibles.get(i).equipo2;

                if(fecha.getPartidos().isEmpty()){
                    fecha.agregarPartido(equipo1,equipo2);
                }
                else {
                    for (Partido p : fecha.getPartidos()) {
                        if (!equipo1.equals(p.getEquipo1()) && !equipo1.equals(p.getEquipo2()) && !equipo2.equals(p.getEquipo1()) && !equipo2.equals(p.getEquipo2())) {
                            fecha.agregarPartido(equipo1, equipo2);
                            partidosAQuitar.add(i);
                        }
                    }
                }
            }
            fechasSorteadas.add(fecha);

            for(int j: partidosAQuitar.reversed()){
                combinacionDePartidosPosibles.remove(j);
            }
            tamanioListaCombinaciones = combinacionDePartidosPosibles.size();

        }


    }
    public int fechaConMayorEmpates(){
        int resultado = -1;
        if (!fechasSorteadas.isEmpty()){
            for(int i=0;i<fechasSorteadas.size();i++ ){
                if (resultado == -1){
                    resultado = i;
                }
                else{
                    if(fechasSorteadas.get(resultado).contadorDeEmpates() < fechasSorteadas.get(i).contadorDeEmpates()){
                        resultado = i;
                    }
                }
            }
        }

        return resultado;
        }

}
