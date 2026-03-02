public class Notas {
  public static void main(String[] args) {
    // Creación e inicialización do array notas
    double[] notas = { 2.4, 5.6, 7.8, 9.0, 3.4, 2.0 };
    // Recorrido incremental do array
    for (double valor : notas) {
      System.out.print(valor + " ");
    }
    System.out.println("\n----------------");
    for (int i = 0; i < 6; i++) {
      System.out.print(notas[i] + " ");
    }

    System.out.println("\nNum de notas: " + notas.length);
  }
}
