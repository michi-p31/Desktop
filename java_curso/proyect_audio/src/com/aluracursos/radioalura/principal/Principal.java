package com.aluracursos.radioalura.principal;

import com.aluracursos.radioalura.module.Cancion;
import com.aluracursos.radioalura.module.Podcast;
import com.aluracursos.radioalura.module.misFavoritos;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Wings");
        miCancion.setCantante("BTS");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Mariana Mamoliti");
        miPodcast.setTitulo("Psicologia al desnudo");

        for (int i = 0; i < 9 ; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miCancion.reproduce();
        }
        //podcast
        for (int i = 0; i < 100 ; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 5000; i++) {
            miPodcast.reproduce();
        }
        System.out.println("Reproducciones" + miCancion.getTotalDeReproducciones());
        System.out.println("Me gustas " + miCancion.getTotalDeMeGusta());

        misFavoritos favoritos = new misFavoritos();
        favoritos.adicone(miCancion);
        favoritos.adicone(miPodcast);
    }
}
