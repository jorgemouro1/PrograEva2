package Exemplos;

public class ExemploStringBuilder {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Ola");

    sb.append(" mundo"); // "Ola mundo"
    sb.insert(3, ","); // "Ola, mundo"
    sb.setCharAt(0, 'H'); // "Hla, mundo"
    sb.replace(4, 9, "amigo"); // "Hla, amigo"
    sb.delete(3, 4); // "Hla amigo"

    System.out.println(sb.toString()); // Saída: "Hla amigo"

    System.out.println(sb.charAt(2)); // Saída: 'a'
    System.out.println(sb.length()); // Saída: 8
    System.out.println(sb.substring(4)); // Saída: "amigo"
    System.out.println(sb.reverse().toString()); // Saída: "ogima alH"
  }
}