/*Crear un programa en Java que use un método que faga un desprazamento circular dunha
posición á esquerda de todos os elementos dun array de enteiros. Mostrar o array antes e
despois da chamada ao método. */

public class Desprazamento {
  public static void Esquerda(int[] chat) {

    // gardo o primeiro elemento nunha variable
    int primeiro = chat[0];
    for (int i = 0; i < chat.length - 1; i++) {
      // cambia un elemento polo seu seguinte
      chat[i] = chat[i + 1];
    }
    // no último meto o que tiña gardado
    chat[chat.length - 1] = primeiro;

  }

  public static void main(String[] args) {
    int[] numerillo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    // mostro
    for (int i = 0; i < numerillo.length; i++) {
      System.out.println(numerillo[i]);
    }
    System.out.println("---------------------------");
    Desprazamento.Esquerda(numerillo);
    // mostro
    for (int i = 0; i < numerillo.length; i++) {
      System.out.println(numerillo[i]);
    }
  }
}
