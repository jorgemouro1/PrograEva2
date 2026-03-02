package Ejercicios;

import java.util.Scanner;;

public class Reemplazar {
  public static void main(String[] args) {
    // creamos o obxecto do escaner
    Scanner sc = new Scanner(System.in);
    // pedimos que vaia metendo as cadenas e pasamolas todas a minusculas
    System.out.print("Introduce a cadea: ");
    String cadea1 = sc.nextLine().toLowerCase();
    System.out.print("Introduce a palabra a cambiar: ");
    String cambiar = sc.nextLine().toLowerCase();
    System.out.print("Introduce a palabra pola que queres reemplazala: ");
    String reemplazo = sc.nextLine().toLowerCase();

    // reemplazamos o q queremos cambiar polo reemplazo e mostramos
    String resultado = cadea1.replaceAll(cambiar.toLowerCase(), reemplazo.toLowerCase());
    System.out.println(resultado);

    sc.close();
  }
}
