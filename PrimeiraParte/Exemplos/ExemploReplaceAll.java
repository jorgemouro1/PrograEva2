package Exemplos;

public class ExemploReplaceAll {
  public static void main(String[] args) {
    String texto = "2025-08-05";
    // Substituímos todos os guións por barras
    String resultado = texto.replaceAll("-", "cadelo");
    System.out.println(resultado); // "2025/08/05"
  }
}
