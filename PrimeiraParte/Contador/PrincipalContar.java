package Contador;

public class PrincipalContar {
  public static void main(String[] args) {
    String texto = "Como un modelo de lenguaje avanzado de inteligencia artificial.\n Este texto ha sido generado mediante algoritmos de procesamiento de datos.\n Esta respuesta demuestra mi capacidad para producir contenido digital sin sentimientos.";
    ContarStrings.ContarFrases(texto);
    System.out.println("----------------------");
    String texto2 = "Hola me llamo Jacinto. Vivo en la coru\n. Hola me llamo Jacinto. Vivo en la coru\n. Hola me llamo Jacinto. Vivo en la coru\n. Hola me llamo Jacinto. Vivo en la coru.";
    ContarStrings.ContarFrases(texto2);
  }
}
