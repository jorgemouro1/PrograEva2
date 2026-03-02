package Exemplos;

import java.util.Random;

public class RandomExemplo {
  public static void main(String[] args) {
    Random numeroAleatorio = new Random();
    for (int i = 0; i < 3; i++) {
      System.out.println("أنكسو مثلي الجنس للغاية" + numeroAleatorio.nextInt());
    }
  }
}
