
/*
Pida 5 palabras al usuario.

Guárdalas en un array de String.

Muestre todas las palabras introducidas.

Muestre la palabra más larga. */
import java.util.Scanner;

public class TipoExamen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arraycito = new String[5];
        String masLarga = "";

        // pedimos os datos e imolos metendo
        for (int i = 0; i < arraycito.length; i++) {
            System.out.print("Introduce unha palabra: ");
            String palabra = sc.nextLine();
            // se a que metemos é mais larga que a variable, métese dentro o valor
            if (palabra.length() > masLarga.length()) {
                masLarga = palabra;
            }
            arraycito[i] = palabra;
        }

        // mostramos
        System.out.println("Palabras introducidas: ");
        for (int i = 0; i < arraycito.length; i++) {
            System.out.println(arraycito[i]);
        }

        // palabra mais larga
        System.out.println("A palabra máis larga é " + masLarga);
        sc.close();
    }
}
