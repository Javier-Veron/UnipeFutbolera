package com.example.unipefutbolera;

public class Partido {

    Equipo equipo1,equipo2;
    ResultadoPartido resultado1, resultado2;

    public Partido(Equipo equipo1, Equipo equipo2){

        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado1 = null;
        this.resultado2 = null;

    }


    public Partido(Equipo equipo1, Equipo equipo2, ResultadoPartido resultado1, ResultadoPartido resultado2){

        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado1 = resultado1;
        this.resultado2 = resultado2;

    }

    public void jugarPartido(){

        ResultadoPartido partidoGanado = new PartidoGanado();
        ResultadoPartido partidoPerdido = new PartidoPerdido();
        ResultadoPartido partidoEmpatado = new PartidoEmpatado();

        if(!equipo1.isTieneArquero() && equipo2.isTieneArquero()) {
            setResultado1(partidoPerdido);
            equipo1.agregarResultadoPartido(partidoPerdido);
            setResultado2(partidoGanado);
            equipo2.agregarResultadoPartido(partidoGanado);

        }
        else if(equipo1.isTieneArquero() && !equipo2.isTieneArquero()){
            setResultado1(partidoGanado);
            equipo1.agregarResultadoPartido(partidoGanado);
            setResultado2(partidoPerdido);
            equipo2.agregarResultadoPartido(partidoPerdido);
        }
        else if(!equipo1.isTieneArquero() && !equipo2.isTieneArquero()){
            setResultado1(partidoEmpatado);
            setResultado2(partidoEmpatado);
            equipo1.agregarResultadoPartido(partidoEmpatado);
            equipo2.agregarResultadoPartido(partidoEmpatado);
        }


        else if((equipo1.esSalvaje() || equipo1.esImpenetrable()) && (equipo2.esSalvaje() || equipo2.esImpenetrable())){
            setResultado1(partidoEmpatado);
            setResultado2(partidoEmpatado);
            equipo1.agregarResultadoPartido(partidoEmpatado);
            equipo2.agregarResultadoPartido(partidoEmpatado);
        }

        else{
            //ganará el equipo con mayor cantidad de puntos de ataque, que es la sumatoria de de los puntos de
            //ataque de cada jugador titular (precisión al arco*fuerza de tiro).
            if(equipo1.calcularPuntosDeAtaque() > equipo2.calcularPuntosDeAtaque()){
                setResultado1(partidoGanado);
                equipo1.agregarResultadoPartido(partidoGanado);
                setResultado2(partidoPerdido);
                equipo2.agregarResultadoPartido(partidoPerdido);
            }
            if(equipo1.calcularPuntosDeAtaque() < equipo2.calcularPuntosDeAtaque()){
                setResultado1(partidoPerdido);
                equipo1.agregarResultadoPartido(partidoPerdido);
                setResultado2(partidoGanado);
                equipo2.agregarResultadoPartido(partidoGanado);
            }
            if(equipo1.calcularPuntosDeAtaque() == equipo2.calcularPuntosDeAtaque()){
                setResultado1(partidoEmpatado);
                setResultado2(partidoEmpatado);
                equipo1.agregarResultadoPartido(partidoEmpatado);
                equipo2.agregarResultadoPartido(partidoEmpatado);
            }

        }
    }

    //GETTERS AND SETTERS

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
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
