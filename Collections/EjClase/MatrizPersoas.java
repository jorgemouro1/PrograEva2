package Collections.EjClase;

import java.util.Scanner;

/*
3x3, con nomes de persoas. 2 matrices. segunda crease a partir da primeira e conten numero de caracteres de nome na posicion
mostrar en bo formato
 */
public class MatrizPersoas {
  public static void main(String[] args) {
    String[][] matricilla1 = new String[3][3];
    Scanner sc = new Scanner(System.in);
    int[][] matricilla2 = new int[3][3];

    // imos recorrendo a matriz, e imos metendo en cada posición un nome, e na outra
    // matriz a súa lenght
    for (int i = 0; i < matricilla1.length; i++) {
      for (int j = 0; j < matricilla1[i].length; j++) {
        System.out.print("Introduce un nome bonitillo: ");
        String nomecillo = sc.nextLine();
        matricilla1[i][j] = nomecillo;
        matricilla2[i][j] = nomecillo.length();
      }
    }

    // matriz 1
    // mostramola
    System.out.println("\nMatriz 1 de nomes: \n");
    for (int i = 0; i < matricilla1.length; i++) {
      for (int j = 0; j < matricilla1[i].length; j++) {
        System.out.print(matricilla1[i][j] + "\t");
      }
      System.out.println("\n");
    }

    // matriz 2
    // mostramola
    System.out.println("Matriz 2 de lonxitude de nomes: \n");
    for (int i = 0; i < matricilla2.length; i++) {
      for (int j = 0; j < matricilla2[i].length; j++) {
        System.out.print(matricilla2[i][j] + "\t");
      }
      System.out.println("\n");
    }

    sc.close();
  }
}
