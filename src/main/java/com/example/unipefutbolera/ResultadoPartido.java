package com.example.unipefutbolera;

/*El partido ganado otorgará 3
puntos y aumentará la cantidad de fanáticos un 20% de la cantidad que tenía al momento de jugarse el partido, si empata
obtendrá 1 punto y la cantidad de fanáticos se verá disminuida un 5%, en caso de que pierda  no obtendrá puntos y sus
fanáticos disminuyen un 15%.*/

public abstract class ResultadoPartido {

    public abstract int puntos();
    public abstract double fanaticos();
}
