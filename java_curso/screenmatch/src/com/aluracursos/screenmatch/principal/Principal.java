package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculodoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(210);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(5);
        miPelicula.evalua(8.8);
        System.out.println(miPelicula.getTotaEvaluaciones());
        System.out.println(miPelicula.calcularEvaluaciones());

        Serie casaDragon = new Serie("Casa dragon", 2019);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(15);
        casaDragon.setMinutosPorEpisodio(60);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());
        CalculodoraDeTiempo calculadora = new CalculodoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa del dragon");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);
        filtroRecomendacion.filtra(episodio);

        var pelicula_bruno = new Pelicula("Señor de los anillos", 2001);
        pelicula_bruno.setDuracionEnMinutos(110);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(pelicula_bruno);
        listaDePeliculas.add(miPelicula);

        System.out.println("Tamaño de la lista: " +listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());

    }
}
