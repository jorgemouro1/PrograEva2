package Collections.EjClase;

public class Multidimensionalito {
  public static void main(String[] args) {
    int[][] arraicito = new int[3][5];

    // recorremos as filas e columnas
    for (int i = 0; i < arraicito.length; i++) {
      for (int j = 0; j < arraicito[i].length; j++) {
        // metemos en cada posicion, a multiplicacion da posicion i por j
        arraicito[i][j] = i * j;
        System.out.print(arraicito[i][j] + "\t");
      }
      System.out.println("\n");
    }
  }
}
