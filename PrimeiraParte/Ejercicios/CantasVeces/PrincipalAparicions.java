package Ejercicios.CantasVeces;

import java.util.Scanner;

public class PrincipalAparicions {
  public static void main(String[] args) {
    String texto1 = " ";
    String buscar = " ";
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce a primeira cadea: ");
    texto1 = sc.nextLine();
    System.out.print("Introduce o que queres buscar: ");
    buscar = sc.nextLine();
    System.out.println(Aparicions.aparicionsPalabra(texto1, buscar));
    sc.close();
  }
}
