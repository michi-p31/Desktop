package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalconListas {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(8);
        Serie casaDragon = new Serie("Casa dragon", 2019);
        var pelicula_bruno = new Pelicula("Señor de los anillos", 2001);
        pelicula_bruno.evalua(9);

        List<titulo> lista = new ArrayList<>();
        lista.add(pelicula_bruno);
        lista.add(miPelicula);
        lista.add(casaDragon);

        for ( titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula){
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio baderas");
        listaDeArtistas.add("Ricardo Darin");

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artitas ordenada" + listaDeArtistas );

        Collections.sort(lista);
        System.out.println("Lista de artitas ordenada" + lista );

        lista.sort(Comparator.comparing(titulo::getFechaDeLazanmiento));
        System.out.println("Lista ordena por fecha: " +lista);
    }

}
