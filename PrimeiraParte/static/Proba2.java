public class Proba2 {
  int x = 5;

  public int getX() {
    return x;
  }

  public static void metodo() {
    // System.out.println(x); // Erro: non se pode acceder directamente a variable
    // de instancia
    Proba2 p2 = new Proba2();
    System.out.println(p2.getX()); // Erro: non se pode usar this nun método static
  }

  public static void main(String[] args) {
    Proba2.metodo();
  }
}
