
//pedimos cantos quere meter, imoslle pedindo, gardamos no array, creamos metodo pares
//ordenamos ascendentemente, mostramos solo pares
import java.util.Arrays;
import java.util.Scanner;

public class Pares {

    public static int[] deixarPares(int[] arraycito) {
        for (int i = 0; i < arraycito.length; i++) {
            if (arraycito[i] % 2 != 0) {
                arraycito[i] = 0;
            }
        }
        Arrays.sort(arraycito);

        return arraycito;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce cantos num vas meter: ");
        int cantidadeNums = sc.nextInt();

        int[] arraycillo = new int[cantidadeNums];

        for (int i = 0; i < cantidadeNums; i++) {
            System.out.print("Introduce o " + i + "º num: ");
            int numerillos = sc.nextInt();
            arraycillo[i] = numerillos;
        }

        for (int i = 0; i < arraycillo.length; i++) {
            System.out.println("Elemento " + i + " do array: " + arraycillo[i]);
        }

        System.out.println("----------------");
        int[] soloPares = Pares.deixarPares(arraycillo);
        for (int i = 0; i < soloPares.length; i++) {
            if (soloPares[i] != 0) {
                System.out.println(soloPares[i]);
            }
        }

        sc.close();
    }
}
