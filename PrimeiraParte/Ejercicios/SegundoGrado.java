package Ejercicios;

import java.util.Scanner;

public class SegundoGrado {
  public static void main(String[] args) {
    double a;
    double b;
    double c;

    // metemos os valores
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce o valor de a: ");
    a = sc.nextDouble();
    System.out.print("Introduce o valor de b: ");
    b = sc.nextDouble();
    System.out.print("Introduce o valor de c: ");
    c = sc.nextDouble();
    double discriminante = (Math.pow(b, 2) - (4 * a * c));

    // se o discriminante é menor q 0 devolve un error
    if (discriminante < 0 && (a != 0 && b != 0 && c != 0)) {
      System.out.println("O discriminante non pode ser negativo, non ten solución en reais");
    } else if ((discriminante) == 0) {
      System.out.println("Solamente ten a solución: " + -b / 2 * a);
    } else if (a != 0 && b != 0 && c != 0) { // se é completa fai a fórmula normal
      // System.out.println("(-" + b + "+-raíz de (" + b + "^2-4*" + a + "*" + c + ")
      // /2*" + a + ")");
      System.out.println("Os resultados son: ");
      // facemos cada conta cos datos q nos dan
      System.out.println((-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
      System.out.println((-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
    } else if (a == 0) { // se falta a resólvea normalmente coma unha de primeiro grao
      System.out.println("Non é de segundo grado");
      System.out.println("A solución da ecuación de primeiro grado é: " + -c / b);
    } else if (b == 0) { // se falta b facemos a raíz da división
      System.out.println("As solucións son: " + Math.sqrt(-c / a) + " e " + -Math.sqrt(-c / a));
    } else if (c == 0) { // se falta 0 sacamos factor comun asi q 1 solucion é 0 e outra é a división
      System.out.println("As solucións son: 0 e " + -b / a);
    } else if (b == 0 && c == 0) { // se faltan b c, 0 é doble
      System.out.println("A solución é 0 doble");
    }
    sc.close();
  }

}
