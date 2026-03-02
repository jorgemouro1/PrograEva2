package Contador;

public class ContarStrings {

  public static void ContarFrases(String texto) {
    // inicializamos os contadores
    int contadorpalabras = 0;
    int contadorparrafo = 1;
    int contadorfrases = 0;
    for (int i = 1; i < texto.length(); i++) { // bucle para q vaia contando
      char letra = texto.charAt(i); // miramos cada caracter cas posicions de i
      if (letra == '.') { // se é punto súmase ao contador de frases
        contadorfrases++;
        contadorpalabras++;
      } else if (letra == '\n') { // se é salto de liña ao de parágrafos
        contadorparrafo++;
      } else if (letra == ' ' && texto.charAt(i - 1) != '.') {
        contadorpalabras++;
      }
    }
    // mostramos os resultados
    System.out.println("Nº de parágrafos: " + contadorparrafo);
    System.out.println("Nº de frases: " + contadorfrases);
    System.out.println("Nº de palabras: " + contadorpalabras);
    System.out.println("Nº de letras : " + texto.length());
  }
}
