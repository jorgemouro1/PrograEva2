
public class Exemplo {
  // Método static
  public static void saudoStatic() {
    System.out.println("Ola dende método static!");
  }

  // Método de instancia
  public void saudoInstancia() {
    System.out.println("Ola dende método de instancia!");
  }

  public static void main(String[] args) {
    // Chamando método static sen crear obxecto
    Exemplo.saudoStatic();
    // Para chamar ao método de instancia, precisamos un obxecto
    Exemplo obx = new Exemplo();
    obx.saudoInstancia();
  }
}
