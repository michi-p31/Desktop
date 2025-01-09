package com.aluracursos.screenmatch.modelos;

public abstract class titulo implements Comparable<titulo>{
    String nombre;
    int fechaDeLazanmiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeEvaluaciones;
    private int totaEvaluaciones;

    public titulo(String nombre, int fechaDeLazanmiento) {
        this.nombre = nombre;
        this.fechaDeLazanmiento = fechaDeLazanmiento;
    }

    public void  setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setFechaDeLazanmiento(int fechaDeLazanmiento) {
        this.fechaDeLazanmiento = fechaDeLazanmiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLazanmiento() {
        return fechaDeLazanmiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public int getTotaEvaluaciones(){
        return totaEvaluaciones;
    }

    public void muestraFichaTecnica (){
        System.out.println("El nombre de la pelicula es:" + nombre);
        System.out.println("La fecha de Lanzamiento es: " + fechaDeLazanmiento);
        System.out.println("Su duracion " + getDuracionEnMinutos());
    };

    public void evalua (double nota) {
        sumaDeEvaluaciones += nota;
        totaEvaluaciones ++;
    }

    public double calcularEvaluaciones (){
        return sumaDeEvaluaciones/totaEvaluaciones;
    }

    @Override
    public int compareTo(titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
