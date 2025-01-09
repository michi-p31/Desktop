package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.titulo;

public class CalculodoraDeTiempo {
    private int tiempoTotal;
    public void incluye(titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();

    }
    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
