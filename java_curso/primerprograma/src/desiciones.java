public class desiciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = false;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

//        if (fechaDeLanzamiento >= 2022){
//            System.out.println("Peliculas mas populares");
//        }else {
//            System.out.println("Peliculas retro que aun se pueden ver ");
//        }
        if (incluidoEnElPlan && tipoPlan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        }else {
            System.out.println("Pelicula no disponible para su plana actual");
        }

    }
}
