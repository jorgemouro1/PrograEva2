package Bidimensionais;

public class Proba {
  public static void main(String[] args) {
    int[][] numeros = { { 1, 3, 5, 7, 9, 11 }, // Fila 0
        { 2, 4, 6, 8, 10, 12 }, // Fila 1
        { 20, 40, 60, 70, 80, 90 }, // Fila 2
        { 111, 222, 333, 444, 555, 666 }, // Fila 3
        { 15, 25, 35, 45, 55, 65 } }; // Fila 4
    // Recorrido
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Fila " + i + "\n\t");
      for (int j = 0; j < numeros[i].length; j++) {
        System.out.print("numeros[" + i + "][" + j + "] = " + numeros[i][j] + "\t");
      }
      System.out.println();
    }

  }
}
