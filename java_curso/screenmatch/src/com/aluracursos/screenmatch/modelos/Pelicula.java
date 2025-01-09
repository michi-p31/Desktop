package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class Pelicula extends titulo implements Clasificacion {
    private String director;

    // constructores
    public Pelicula(String nombre, int fechaDeLazanmiento) {
        super(nombre, fechaDeLazanmiento);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) calcularEvaluaciones() /2;
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getNombre() + "(" + getFechaDeLazanmiento() + ")";
    }
}
