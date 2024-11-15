package com.example.unipefutbolera;
import java.util.ArrayList;

public class Equipo {

    //Atributos

    private String nombre;
    private int fanaticos;
    private ArrayList<ResultadoPartido> historialResultados = new ArrayList<>();
    private ArrayList<Jugador> jugadoresTitulares = new ArrayList<>();
    private ArrayList<Jugador> jugadoresSuplentes = new ArrayList<>();
    private boolean tieneArquero = false;

    //Consultas

    public int calcularPuntaje(){
        int resultado = 0;
        for(ResultadoPartido r: historialResultados){
            resultado += r.puntos();
        }

        return resultado;

    }

    public double calcularFanaticos(){
        double resultado = fanaticos;
        for(ResultadoPartido r: historialResultados){
            resultado = resultado * r.fanaticos();
        }

        return resultado;

    }

    public ArrayList<Jugador> jugadoresZurdos(){

        ArrayList<Jugador> listaResultado = new ArrayList<>();
        for(Jugador j : jugadoresTitulares){
            if (j.esZurdo()){
                listaResultado.add(j);
            }
        }
        for(Jugador j : jugadoresSuplentes){
            if (j.esZurdo()){
                listaResultado.add(j);
            }
        }
        return listaResultado;
    }

    public int cantidadZurdos(){
        int resultado = 0;

        for(Jugador j : jugadoresTitulares){
            if (j.esZurdo()){
                resultado += 1;
            }
        }
        for(Jugador j : jugadoresSuplentes){
            if (j.esZurdo()){
                resultado += 1;
            }
        }
        return resultado;
    }

    public boolean hayArqueroSuplente(){

        for(Jugador j : jugadoresSuplentes){
            if (j.getAltura()>=1.80){
                return true;
            }
        }
        return false;
    }

    public boolean esSalvaje(){

        int cantidadJugadores = jugadoresTitulares.size() + jugadoresSuplentes.size();
        int contadorDelanteros = 0;

        for(Jugador j : jugadoresTitulares){
            if (j.rolJugador().equals("Delantero")){
                contadorDelanteros += 1;
            }
        }
        for(Jugador j : jugadoresSuplentes){
            if (j.rolJugador().equals("Delantero")){
                contadorDelanteros += 1;
            }
        }

        return contadorDelanteros > (cantidadJugadores / 2);

    }

    public boolean esImpenetrable(){

        int cantidadJugadores = jugadoresTitulares.size() + jugadoresSuplentes.size();
        int contadorDefensores = 0;

        for(Jugador j : jugadoresTitulares){
            if (j.rolJugador().equals("Defensor")){
                contadorDefensores += 1;
            }
        }
        for(Jugador j : jugadoresSuplentes){
            if (j.rolJugador().equals("Defensor")){
                contadorDefensores += 1;
            }
        }

        return contadorDefensores > (cantidadJugadores / 2);

    }

    public int cantidadEmpates(){
        int resultado = 0;
        for(ResultadoPartido r: historialResultados){
            if(r.getClass() == PartidoEmpatado.class){
                resultado += 1;
            }
        }
        return resultado;
    }

    public int calcularPuntosDeAtaque(){
        int resultado = 0;
        for(Jugador j: jugadoresTitulares){
            resultado += j.calcularPuntosDeAtaque();
        }
        return resultado;
    }

    //METODOS
    public void agregarJugadorSuplente(Jugador jugador){
        if(jugador.getClass() != Arquero.class){
            jugadoresSuplentes.add(jugador);
        }
        else{
            if(!tieneArquero){
                jugadoresSuplentes.add(jugador);
                tieneArquero = true;
            }
        }

    }

    public void agregarJugadorTitular(Jugador jugador){
        if(jugador.getClass() != Arquero.class){
            jugadoresTitulares.add(jugador);
        }
        else{
            if(!tieneArquero){
                jugadoresTitulares.add(jugador);
                tieneArquero = true;
            }
        }

    }

    public void cambioJugadores(int posicionListaTitular, int posicionListaSuplente){

        Jugador cambioASuplente = jugadoresTitulares.get(posicionListaTitular);
        Jugador cambioATitular = jugadoresSuplentes.get(posicionListaSuplente);

        jugadoresTitulares.remove(posicionListaTitular);
        jugadoresSuplentes.remove(posicionListaSuplente);

        jugadoresSuplentes.add(cambioASuplente);
        jugadoresTitulares.add(cambioATitular);

    }

    public void agregarResultadoPartido(ResultadoPartido resultadoObtenido){

        historialResultados.add(resultadoObtenido);

    }

    public void seLesionaElArquero(){
        tieneArquero = false;
        if(hayArqueroSuplente()){
            tieneArquero = true;
        }
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFanaticos() {
        return fanaticos;
    }

    public void setFanaticos(int fanaticos) {
        this.fanaticos = fanaticos;
    }

    public ArrayList<ResultadoPartido> getHistorialResultados() {
        return historialResultados;
    }

    public void setHistorialResultados(ArrayList<ResultadoPartido> historialResultados) {
        this.historialResultados = historialResultados;
    }

    public ArrayList<Jugador> getJugadoresTitulares() {
        return jugadoresTitulares;
    }

    public void setJugadoresTitulares(ArrayList<Jugador> jugadoresTitulares) {
        this.jugadoresTitulares = jugadoresTitulares;
    }

    public ArrayList<Jugador> getJugadoresSuplentes() {
        return jugadoresSuplentes;
    }

    public void setJugadoresSuplentes(ArrayList<Jugador> jugadoresSuplentes) {
        this.jugadoresSuplentes = jugadoresSuplentes;
    }

    public boolean isTieneArquero() {
        return tieneArquero;
    }

    public void setTieneArquero(boolean tieneArquero) {
        this.tieneArquero = tieneArquero;
    }
}



