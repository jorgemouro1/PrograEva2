package Aplicacion;

import Matematicas.Operacions;

public class Principal {
  public static void main(String[] args) {
    Operacions o1 = new Operacions();
    System.out.println("Suma: " + o1.sumar(5, 16));
    System.out.println("Resta: " + o1.restar(5, 3));
    System.out.println("Produto: " + o1.multiplicar(5, 20));

    try {
      System.out.println("División: " + o1.dividir(5, 0));
    } catch (ArithmeticException e) {
      System.out.println("Non se pode dividir entre 0");
    }
  }
}
