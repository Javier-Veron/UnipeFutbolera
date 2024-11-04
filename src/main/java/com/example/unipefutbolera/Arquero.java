package com.example.unipefutbolera;

public class Arquero extends Jugador{

    int precisionAlArco = 2;
    int habilidadDefensiva = 10;


    @Override
    public float chanceDeHacerGol() {
        if (super.esZurdo()){
            return (float) (precisionAlArco*0.5*super.getFuerzaDeTiro()*1.2);
        }
        return (float) (precisionAlArco*0.5*super.getFuerzaDeTiro());
    }

    public float chanceGolDeCabeza() {

        return (float) (super.getAltura()*precisionAlArco);

    }

    public String rolJugador(){
        return "Arquero";
    }

    public int calcularPuntosDeAtaque(){
        return precisionAlArco*super.getFuerzaDeTiro();
    }

}
