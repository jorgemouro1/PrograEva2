package Ejercicios.StringBuildera;

public class MetodosStringBuilder {
  public static String Invertir(String cadea) {
    String novacadea = "";
    StringBuilder sb = new StringBuilder(cadea);
    // damoslle a volta e pasamolo a string
    novacadea = sb.reverse().toString();
    return novacadea;
  }

  public static String quitarVogais(String cadea) {
    StringBuilder sb = new StringBuilder();
    // creo un string con todas as vocais
    String vocais = "aeiouAEIOU";
    // fago un bucle e vai mirando se en cada posicion hai unha vocal. se non é
    // vocal, méteo en sb e fai unha palabra sin vocais
    for (int i = 0; i < cadea.length(); i++) {
      char c = cadea.charAt(i);
      if (vocais.indexOf(c) == -1) {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public static String substituirFragmento(String frase, String palabra, String substituto) {
    // reemplaza directamente
    String resultado = frase.replaceAll(palabra.toLowerCase(), substituto.toLowerCase());
    return resultado;
  }

  public static String introducir(String frase, String palabra, int pos) {
    StringBuilder sb = new StringBuilder(frase);
    // inserta a palabra que se lle pase na posición que se lle diga
    sb.insert(pos, palabra);
    return sb.toString();

  }
}
