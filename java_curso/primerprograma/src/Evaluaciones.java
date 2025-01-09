import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0 ;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1){
            System.out.println("Escribe la nota que le darias a la pelicula matrix");
            nota = teclado.nextDouble();
            mediaEvaluaciones += nota;
            totalEvaluaciones++;
        }
        System.out.println("la media de evaluaciones para matrix es " + mediaEvaluaciones/ totalEvaluaciones);
        }
    }
