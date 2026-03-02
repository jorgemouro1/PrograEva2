package Ejercicios.Largo;

import java.util.Scanner;

public class Caracteres {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // iniciamos as variables
    int valor = 1;
    int nummenu;
    int valoresmenu;
    int contadorletras = 0;
    int contadornumeros = 0;
    int contadormaiusculas = 0;
    boolean meterdatos = false;

    // bucle para que o usuario meta cantos numeros quere introducir
    do {
      System.out.print("Introduce os números a ler entre 1 e 50 (0 para salir): ");
      valor = sc.nextInt();
    } while (valor < 0 || valor > 50); // repítese hasta que se meta un valor válido
    if (valor == 0) { // cando é 0, para
      System.out.println("Saíndo do programa");
    } else {
      // despois de seleccionar cantos numeros metemos, mostramos o menú cas opcións
      while (!meterdatos) {
        System.out.println("1. Indicar nº de letras");
        System.out.println("2. Indicar nº de díxitos");
        System.out.println("3. Indicar cantos son maiúsculas");
        System.out.println("4. Transformar a minúsculas.");
        System.out.println("5. Saír");
        System.out.print("Introduce unha opción: ");
        nummenu = sc.nextInt();

        switch (nummenu) {
          case 1:
            contadorletras = 0;
            for (int i = 1; i <= valor; i++) {// introducimos tantos numeros como dixo o usuario antes
              System.out.print("Introduce un número: ");
              valoresmenu = sc.nextInt();
              char car = (char) valoresmenu; // convertimos o valor que mete o usuario a carácter
              if (Character.isLetter(car) == true) { // se é unha letra, o contador vai sumando
                contadorletras++;
                System.out.println("Imprimiches o " + car); // devolvo o valor se é letra
              }
            }
            System.out.println("Hai: " + contadorletras + " letras"); // mostra por pantalla cantas letras contou
            break;
          case 2:
            contadornumeros = 0;
            for (int i = 1; i <= valor; i++) {// o mismo que antes, imos metendo datos e comprobando se son numeros
              System.out.print("Introduce un número: ");
              valoresmenu = sc.nextInt();
              char car = (char) valoresmenu; // convirto o valor a caracter
              if (Character.isDigit(car) == true) {
                contadornumeros++;
                System.out.println("Imprimiches o " + car);
              }
            }
            System.out.println("Hai " + contadornumeros + " numeros");
            break;
          case 3:
            contadormaiusculas = 0;
            for (int i = 1; i <= valor; i++) {// o mismo que antes, imos metendo datos e comprobando se algun e
                                              // maiuscula
              System.out.print("Introduce un número: ");
              valoresmenu = sc.nextInt();
              char car = (char) valoresmenu; // convirto o valor a caracter
              if (Character.isUpperCase(car) == true) {
                contadormaiusculas++;
                System.out.println("Imprimiches o " + car);
              }
            }
            System.out.println("Hai " + contadormaiusculas + " maiusculas");
            break;
          case 4:
            for (int i = 1; i <= valor; i++) {// o mismo que antes, imos metendo datos e comprobando se algun e
                                              // maiuscula
              System.out.print("Introduce un número: ");
              valoresmenu = sc.nextInt();
              char car = (char) valoresmenu; // convirto o valor a caracter
              if (Character.isLetter(car) && Character.isUpperCase(car)) { // se é letra e se está en maiúscula,
                                                                           // cámbiaa.
                System.out.println("Imprimiches o " + car + " e a minúscula é " + Character.toLowerCase(car));
              }
            }

            break;
          case 5:
            System.out.println("Saíndo...");
            meterdatos = true; // cambiamos o booleano para salir
            break;
          default:
            System.out.println("67");
            break;
        }
      }

    }

    sc.close();
  }
}
