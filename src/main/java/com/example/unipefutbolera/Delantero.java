package com.example.unipefutbolera;

public class Delantero extends Jugador {

    int precisionAlArco = 10;
    int habilidadDefensiva = 2;

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
        return "Delantero";
    }
    public int calcularPuntosDeAtaque(){
        return precisionAlArco*super.getFuerzaDeTiro();
    }

}
