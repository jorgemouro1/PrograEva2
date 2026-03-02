package Ejercicios.Comparacion;

public class AppComparacion {
  public static void main(String[] args) {
    int comparativa = Comparacion.Iguais();
    if (comparativa == -1) {// segun o numero que sala salta un mensaje
      System.out.println("A lonxitude das cadeas non é igual.");
    } else if (comparativa == 0) {
      System.out.println("As cadeas non son iguais");
    } else if (comparativa == 1) {
      System.out.println("As cadeas son iguais lexicográficamente");
    } else if (comparativa == 2) {
      System.out.println("As cadeas son exactamente iguais");
    } else {
      System.out.println("Algo fixeches mal");
    }
  }
}
