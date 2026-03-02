package Operacion;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // pedimos por teclado a frase
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce a túa cadea: ");
        String cadea1 = sc.nextLine();
        // probamos o primeiro método
        System.out.println("A cadea do revés é: " + OperacionsCadeas.reves(cadea1));
        // probamos o segundo método
        System.out.println("A cadea sen espazos é: " + OperacionsCadeas.sinEspazos(cadea1));
        // palindromo
        System.out.println("É palíndroma? "+OperacionsCadeas.palindromo(cadea1));
        sc.close();
    }
}
