
/*
Declarar un array de 12 doubles. Facer un menú para facer o seguinte:
a) Introducir os 12 números
b) Mostrar os 12 números.
c) Pedir unha posición e escribir nesa posición o valor 0 validar posición
d) Pedir unha posición e escribir nesa posición o valor introducido por teclado. 
e) Intercambiar os 2 primeiros valores do array.
f) Intercambiar o 3º e o 4º valor do array.
g) Intercambia os valores de array 2 a 2 cun bucle: os 2 primeiros, o 3º co 4º, o 5º co 6º,
etc.
h) Sair. */
import java.util.Scanner;

public class MenuArrays {
  public static void main(String[] args) {
    // declaramos as variables
    Scanner sc = new Scanner(System.in);
    double[] numeros = new double[12];
    int opcion = 0;
    int posi = 0;
    int novonumero = 0;

    while (opcion != 8) {
      // menu
      System.out.println("---------------------------------");
      System.out.println("1. Introducir os valores do array");
      System.out.println("2. Mostrar os valores do array");
      System.out.println("3. Poñer 0 na posición que ti queiras");
      System.out.println("4. Cambiar o valor dunha posición que ti queiras");
      System.out.println("5. Intercambiar os 2 primeiros valores do array");
      System.out.println("6. Intercambiar o 3º e 4º valor do array");
      System.out.println("7. Intercambiar os valores do array 2 a 2. ");
      System.out.println("8. Salir");
      System.out.print("Introduce unha opción: ");

      // gardamos a opción que nos da o usuario
      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          // bucle para que vaia pedindo posición por posición e a vaia gardando
          for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce o valor na posición " + i + ": ");
            numeros[i] = sc.nextDouble();
          }
          break;
        case 2:
          System.out.println("Os valores do array son: ");
          // vai mostrando cada valor
          for (double valor : numeros) {
            System.out.println(valor);
          }
          break;
        case 3:
          // primeiro pedimos onde quere meter o 0
          System.out.print("Introduce a posición na que queres meter un 0: ");
          posi = sc.nextInt();
          // se a posición é menor que 0 ou maior que a lonxitude do array non vale
          if (posi < 0 || posi > numeros.length) {
            System.out.println("O número non é válido");
          } else {
            // se vale, metemos o 0 onde se nos pediu e mostramos
            numeros[posi] = 0;
            System.out.println("Novo array: ");
            for (double valor : numeros) {
              System.out.println(valor);
            }
          }
          break;
        case 4:
          // metemos a posición
          System.out.print("Introduce a posición na que queres meter un número: ");
          posi = sc.nextInt();
          System.out.print("Introduce o numero que queres meter nesa posición: ");
          // pedimos o número
          novonumero = sc.nextInt();
          // comprobamos
          if (posi < 0 || posi > numeros.length) {
            System.out.println("O número non é válido");
          } else {
            numeros[posi] = novonumero;
            // mostramos
            System.out.println("Novo array: ");
            for (double valor : numeros) {
              System.out.println(valor);
            }
          }
          break;
        case 5:
          // metemos o primeiro nunha variable e cambiamos o primeiro polo segundo
          double primeiro = numeros[0];
          numeros[0] = numeros[1];
          // ahora cambiamos o segundo polo valor da variable que tiñamos
          numeros[1] = primeiro;
          System.out.println("Novo array: ");
          for (double valor : numeros) {
            System.out.println(valor);
          }
        case 6:
          // o mismo ca o de antes pero cambiamos o 3º e 4º
          double terceiro = numeros[2];
          numeros[2] = numeros[3];
          numeros[3] = terceiro;
          System.out.println("Novo array: ");
          for (double valor : numeros) {
            System.out.println(valor);
          }
        case 7:
          // facemos que empece en 0 e que vaia avanzando de 2 en 2
          for (int i = 0; i < numeros.length; i = i + 2) {
            // creo unha variable cambiador para almacenar o primeiro valor de cada par
            double cambiador = numeros[i];
            // cambiamos o primeiro polo seguinte
            numeros[i] = numeros[i + 1];
            // cambiamos o seguinte polo primeiro
            numeros[i + 1] = cambiador;
          }
          // mostramos
          System.out.println("Novo array: ");
          for (double valor : numeros) {
            System.out.println(valor);
          }
          break;
        default:
          System.out.println("Mete un valor coma é debido");
          break;
      }
    }
    sc.close();
  }
}
