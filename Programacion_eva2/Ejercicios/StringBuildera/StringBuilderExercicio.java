package Ejercicios.StringBuildera;

import java.util.Scanner;

public class StringBuilderExercicio {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce a túa cadea: ");
    String cadea = sc.nextLine();

    System.out.print("Introduce a palabra a cambiar: ");
    String cambiar = sc.nextLine().toLowerCase();

    System.out.print("Introduce a palabra pola que queres reemplazala: ");
    String reemplazo = sc.nextLine().toLowerCase();

    System.out.println("Introduce a palabra que queres introducir: ");
    String introducir = sc.nextLine();

    System.out.println("Introduce a posición onde a queres meter: ");
    int posicion = sc.nextInt();

    System.out.println("Invertida: " + MetodosStringBuilder.Invertir(cadea));

    System.out.println("Sin vogais: " + MetodosStringBuilder.quitarVogais(cadea));

    System.out.println("Reemplazamos: " + MetodosStringBuilder.substituirFragmento(cadea, cambiar, reemplazo));

    System.out.println("Metemos " + introducir + " na posición " + posicion + " :"
        + MetodosStringBuilder.introducir(cadea, introducir, posicion));

    sc.close();
  }
}
