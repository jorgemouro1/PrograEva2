public class Proba {
  static int x = 5;

  public static void metodo() {
    System.out.println(x); // Erro: non se pode acceder directamente a variable
    // de instancia
    // System.out.println(this.x); // Erro: non se pode usar this nun método static
  }

  public static void main(String[] args) {
    Proba.metodo();
  }
}