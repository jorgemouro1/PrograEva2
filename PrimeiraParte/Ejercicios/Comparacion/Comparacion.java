package Ejercicios.Comparacion;

import java.util.Scanner;

public class Comparacion {

  static String cad1;
  static String cad2;
  static Scanner sc = new Scanner(System.in);

  public static int Iguais() {
    do { // bucle que vai pedindo cadenas hasta q se lle poñan cadenas q non esten
         // baldeiras
      System.out.print("Introduce a primeira cadea: ");
      cad1 = sc.nextLine();
      System.out.print("Introduce a segunda cadea: ");
      cad2 = sc.nextLine();
    } while (cad1.isEmpty() || cad2.isEmpty()); // seguimos pedindo hasta q as duas sexan válidas

    if (cad1.length() != cad2.length()) {
      return -1; // se a lonxitude é distinta devolve -1
    } else if (cad1.equals(cad2)) {
      return 2; // se son iguales de todo da 2
    } else if (cad1.compareToIgnoreCase(cad2) == 0) {
      return 1; // se son iguales lexicograficamente ignorando maiusculas e minusculas devolve 1
    } else if (!cad1.equals(cad2)) {
      return 0; // se non son iguales devolve 0
    } else {
      return 3; // o 3 póñollo porq si
    }
  }
}
