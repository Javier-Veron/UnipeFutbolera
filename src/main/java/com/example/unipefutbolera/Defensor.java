package com.example.unipefutbolera;

public class Defensor extends Jugador {

    //Atributos
    private int precisionAlArco = 4;
    private int habilidadDefensiva = 8;

    //Consultas
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

    public int calcularPuntosDeAtaque(){
        return precisionAlArco*super.getFuerzaDeTiro();
    }

    //GETTERS AND SETTERS

    public int getPrecisionAlArco() {
        return precisionAlArco;
    }

    public void setPrecisionAlArco(int precisionAlArco) {
        this.precisionAlArco = precisionAlArco;
    }

    public int getHabilidadDefensiva() {
        return habilidadDefensiva;
    }

    public void setHabilidadDefensiva(int habilidadDefensiva) {
        this.habilidadDefensiva = habilidadDefensiva;
    }
}
