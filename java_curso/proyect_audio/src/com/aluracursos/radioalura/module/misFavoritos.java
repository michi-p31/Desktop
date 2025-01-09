package com.aluracursos.radioalura.module;

public class misFavoritos {
    public void adicone(_Audio audio) {
        if (audio.getClasificacion() >= 9) {
            System.out.println(audio.getTitulo() + "Favoritos del momento");
        } else {
            System.out.println(audio.getTitulo() + "Baja clasificacion");
        }
    }
}
