import java.util.Arrays;
import java.util.Collections;

public class SumaArrayFuncion {
  // Función que recibe un array e devolve a súa suma
  public static int sumarElementos(int[] array) {
    int suma = 0;
    for (int n : array) {
      suma += n;
    }
    return suma;
  }

  public static void main(String[] args) {
    int[] numeros = { 2, 4, 6, 8, 10 };
    int resultado = sumarElementos(numeros);
    System.out.println("A suma dos elementos é: " + resultado);

    String[] nomes = { "Xoán", "Ana", "Inés", "Pablo", "Irene", "Diego", "Paula" };
    Arrays.sort(nomes);
    System.out.println("Nomes ordenados ascendentemente: " + Arrays.toString(nomes));
    Arrays.sort(nomes, Collections.reverseOrder());
    System.out.println("Nomes ordenados descendentemente: " + Arrays.toString(nomes));

    System.out.println("------------------------------------------");

    Arrays.sort(nomes, 3, 6);
    System.out.println("Nomes ordenados ascendentemente:" + Arrays.toString(nomes));
    Arrays.sort(nomes, 0, 4, Collections.reverseOrder());
    System.out.println("Nomes ordenados descendentemente:" + Arrays.toString(nomes));

  }
}
