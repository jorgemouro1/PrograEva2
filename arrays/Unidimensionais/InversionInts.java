import java.util.Arrays;
import java.util.Scanner;

public class InversionInts {
  public static void inversionInt(int[] arrai) {
    // creamos un caracter auxiliar
    int auxiliar = 0;

    // miramos hasta a mitade para que non cambie o que xa temos cambiado
    for (int i = 0; i < arrai.length / 2; i++) {
      // metemos o primeiro valor na auxiliar
      auxiliar = arrai[i];
      // no primeiro poño o ultimo, no segundo o penultimo etc restandolle a posicion
      arrai[i] = arrai[arrai.length - i - 1];
      arrai[arrai.length - i - 1] = auxiliar;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
    int[] copia = new int[5];

    // bucle para ir metendo elementos no array
    for (int i = 0; i < a.length; i++) {
      System.out.print("Introduce o elemento " + i + " do array: ");
      a[i] = sc.nextInt();
    }

    // bucle para ir metendo os elementos de a en copia
    for (int i = 0; i < a.length; i++) {
      copia[i] = a[i];
    }

    System.out.println("------------------------");
    for (int i = 0; i < a.length; i++) {
      System.out.println("Elemento " + i + " do array normal: " + a[i]);
    }
    System.out.println("------------------------");
    for (int i = 0; i < a.length; i++) {
      System.out.println("Elemento " + i + " do array copia: " + copia[i]);
    }
    System.out.println("------------------------");

    // Ordenar o array a de maneira ascedendente e copia de maneira descendente.
    Arrays.sort(a);
    Arrays.sort(copia);
    inversionInt(copia);

    for (int i = 0; i < a.length; i++) {
      System.out.println("Elemento " + i + " do array normal ordenado: " + a[i]);
    }
    System.out.println("------------------------");
    for (int i = 0; i < a.length; i++) {
      System.out.println("Elemento " + i + " do array copia ordenado invertido: " + copia[i]);
    }
    System.out.println("------------------------");
    sc.close();
  }
}
