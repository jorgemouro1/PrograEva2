
/*Crear un programa que dos datos numéricos dun array, deixe só os pares ordenados de forma crecente. 
O programa deberá facer o seguinte:
 Pedirlle ao usuario cantos números quere introducir.
 Pedirlle ao usuario que introduza tantos número como indicou e gardalos nun array.
 Crear un método ao que se lle pasará a táboa, que deixará só os números pares.
 Mostrar o array de números pares ordenado ascendentemente. */
import java.util.Scanner;
import java.util.Arrays;

public class OrdenarPares {

  public static int[] quitarImpares(int[] arrai) {
    // conto cantos pares hai para poñelo na length
    int contadorPares = 0;
    for (int i = 0; i < arrai.length; i++) {
      if (arrai[i] % 2 == 0) {
        contadorPares++;
      }
    }
    // creo un array auxiliar para meter os pares
    int[] auxiliar = new int[contadorPares];

    int aumentaPosicionPar = 0;

    // imos metendo os pares no auxiliar, se encontra un par méteo e avanza unha
    // posición
    for (int i = 0; i < arrai.length; i++) {
      if (arrai[i] % 2 == 0) {
        auxiliar[aumentaPosicionPar] = arrai[i];
        aumentaPosicionPar++;
      }
    }
    return auxiliar;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int para saber o tamaño do array
    int tamanoarray = 0;
    System.out.print("Introduce cantos números vas querer meter: ");
    // gardo o valor nesta variable
    tamanoarray = sc.nextInt();
    // meto a variable de antes no tamaño do array
    int[] numerillos = new int[tamanoarray];
    // imos pedindo tantos valores como dixo o usuario
    for (int i = 0; i < numerillos.length; i++) {
      System.out.print("Introduce o elemento " + i + " do array: ");
      numerillos[i] = sc.nextInt();
    }
    System.out.println("---------------------------");
    int[] auxiliar2 = OrdenarPares.quitarImpares(numerillos);
    Arrays.sort(auxiliar2);
    for (int i = 0; i < auxiliar2.length; i++) {
      System.out.println("Elemento " + i + " do array de pares: " + auxiliar2[i]);
    }
    sc.close();
  }
}
