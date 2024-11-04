package com.example.unipefutbolera;

public class Centro extends Jugador {

    int precisionAlArco = 6;
    int habilidadDefensiva = 4;

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
        return "Centro";
    }

    public int calcularPuntosDeAtaque(){
        return precisionAlArco*super.getFuerzaDeTiro();
    }
}
