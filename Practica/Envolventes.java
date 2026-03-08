import java.util.Scanner;

public class Envolventes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número, vouno gardar como texto: ");
        String numeroTexto = sc.nextLine();

        // para pasar de texto a número:
        int numerillo = Integer.parseInt(numeroTexto);

        System.out.println("O doble de " + numerillo + " é: " + numerillo * 2);

        if (numerillo % 2 == 0) {
            System.out.println(numerillo + " é par");
        } else {
            System.out.println(numerillo + " é impar");
        }
        sc.close();
    }
}
