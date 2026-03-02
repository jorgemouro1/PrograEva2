package Bidimensionais;

import java.util.Scanner;

/*
Crear un programa en Java que:
 Cree unha matriz (array bidimensional) de enteiros de dimensións filas x columnas. O
número de filas e columnas pediránselle ao usuario por pantalla.
 Encha a matriz con números enteiros do 1 ao 9. Pódense crear de forma aleatoria (Random).
 Mostre a matriz en forma de táboa.
 Calcule a suma de todos os elementos
 */
public class EncherEMostrar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // declaramos as filas, as columnas, e a suma total dos elementos
    int filas = 0;
    int columnas = 0;
    int sumatotal = 0;
    // imos pedindo cantas filas e columnas quere meter
    do {
      System.out.print("Introduce o número de filas que queres na túa matriz (max 5): ");
      filas = sc.nextInt();
      System.out.print("Introduce o número de columnas que queres na túa matriz (max 5): ");
      columnas = sc.nextInt();
    } while (filas < 0 || filas > 5 || columnas < 0 || columnas > 5);

    // creamos a matriz co num de filas e columnas que nos dixo o usuario
    int[][] matrilla = new int[filas][columnas];
    // metemos de forma aleatoria numeros
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        matrilla[i][j] = (int) (Math.random() * 11);
      }
    }
    // mostramos por pantalla
    for (int i = 0; i < matrilla.length; i++) {
      System.out.print("Fila " + i + "\n\t");
      for (int j = 0; j < matrilla[i].length; j++) {
        System.out.print("matrilla[" + i + "][" + j + "] = " + matrilla[i][j] + "\t");
      }
      System.out.println();
    }
    // imos metendo na variable suma cada elemento da matriz, e imos sumando todo
    for (int i = 0; i < matrilla.length; i++) {
      for (int j = 0; j < matrilla[i].length; j++) {
        sumatotal += matrilla[i][j];
      }
    }
    // mostramos
    System.out.println("Suma total dos elementos: " + sumatotal);
    sc.close();
  }
}