package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/*Escribir un programa en Java que:
 Pida ao usuario que introduza un límite inferior e un límite superior para xerar números
aleatorios.
 O programa xerará un número aleatorio dentro dese rango [límite inferior, límite superior].
 O programa repetirá a petición dos límites e a xeración do número ata que o límite superior sexa igual ao límite inferior, momento no que o programa finalizará. */
public class LimiteRandom {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int minimo = 0;
    int maximo = 1;
    Random numeroAleatorio = new Random();
    int bandeira = 0;

    while (bandeira != 1) {
      System.out.println("Introduce o mínimo: ");
      minimo = sc.nextInt();

      System.out.println("Introduce o máximo: ");
      maximo = sc.nextInt();

      if (minimo > maximo) {
        System.out.println("O mínimo non pode ser maior q o máximo");
      } else if (maximo == minimo) {
        bandeira = 1;
        System.out.println("Saíndo do programa");
      } else {
        System.out.println("Número aleatorio: " + numeroAleatorio.nextInt(minimo, maximo + 1));
        System.out.println("----------------------------------------------");
      }
    }

    sc.close();
  }
}
