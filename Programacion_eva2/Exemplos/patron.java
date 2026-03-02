package Exemplos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class patron {
  public static void main(String[] args) {
    Pattern pat = Pattern.compile("^abc.*");
    Matcher mat = pat.matcher("ab");
    if (mat.matches()) {
      System.out.println("Válido");
    } else {
      System.out.println("No Válido");
    }
    // Devolverá “Válido”
  }

}
