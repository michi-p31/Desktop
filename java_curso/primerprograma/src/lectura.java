import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe el nombre de tu pelicula favorita");
        String pelicula = teclado.nextLine();
        System.out.println("Ahora escribe la fecha de lanzamiento");
        int fechadeLanzamiento = teclado.nextInt();
        System.out.println("Que nota le das a la pelicula ");
        double nota = teclado.nextDouble();

        System.out.println(pelicula);
        System.out.println(fechadeLanzamiento);
        System.out.println(nota);
    }
}
