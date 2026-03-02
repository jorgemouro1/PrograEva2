import java.util.Scanner;

public class ArrayTeclado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] enteiros = new int[10];

    // vou pedindo e vou asignando cada posición
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce o número na posición " + i + " :");
      enteiros[i] = sc.nextInt();
    }
    System.out.println("----------");
    // mostro
    for (int i = 0; i < enteiros.length; i++) {
      System.out.println("O elemento na posición " + i + " é: " + enteiros[i]);
    }
    System.out.println("-----Cambiamos primeiro por ultimo-----");

    // primeiro meto o último valor nunha variable
    int ultima = enteiros[enteiros.length - 1];
    // despois cambio o ultimo valor polo primeiro
    enteiros[enteiros.length - 1] = enteiros[0];
    // despois cambio o primeiro elemento pola variable que tiña antes
    enteiros[0] = ultima;

    // mostro outra vez
    for (int i = 0; i < enteiros.length; i++) {
      System.out.println("O elemento na posición " + i + " é: " + enteiros[i]);
    }
    sc.close();
  }
}
