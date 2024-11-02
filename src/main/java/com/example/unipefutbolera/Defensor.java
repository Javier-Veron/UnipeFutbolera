package com.example.unipefutbolera;

public class Defensor extends Jugador {
    int precisionAlArco = 4;
    int habilidadDefensiva = 8;

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
        return "Defensor";
    }
}
