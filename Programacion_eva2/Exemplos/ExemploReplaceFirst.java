package Exemplos;

public class ExemploReplaceFirst {
  public static void main(String[] args) {
    String texto = "gato, gatonegro, gatillo";
    // Cambiamos só o primeiro que comeza por "gat"
    String resultado = texto.replaceFirst("gat\\w*", "can");
    System.out.println(resultado); // Saída: "can, gatonegro, gatillo"
  }
}
