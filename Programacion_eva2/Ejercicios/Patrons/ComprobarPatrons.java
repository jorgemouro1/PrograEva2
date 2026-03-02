package Ejercicios.Patrons;

import java.util.regex.Pattern;

import java.util.Scanner;
import java.util.regex.Matcher;

public class ComprobarPatrons {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String cadenaTeclado = "";
    System.out.print("Introduce a cadena que queres comprobar: ");
    cadenaTeclado = sc.nextLine();
    String patronTeclado = "";
    System.out.print("Introduce o patrón a seguir: ");
    patronTeclado = sc.nextLine();

    cadenaTeclado.trim();
    patronTeclado.trim();

    Pattern patrons = Pattern.compile(patronTeclado);
    Matcher mat = patrons.matcher(cadenaTeclado);

    if (mat.matches()) {
      System.out.println("A cadena é valida");
    } else {
      System.out.println("Non vale");
    }

    sc.close();
  }
}
