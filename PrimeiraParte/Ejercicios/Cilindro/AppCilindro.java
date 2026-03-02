package Ejercicios.Cilindro;

public class AppCilindro {
  public static void main(String[] args) {
    // creamos un obxecto para usar os métodos de instancia
    Cilindro c1 = new Cilindro();
    // métolle valores cos setters
    c1.setAltura(6);
    c1.setRadio(7);

    // probamos os métodos static, non se lle aplica ao obxecto que creamos e
    // metémoslle nos os valores
    Cilindro.area(5, 10);
    Cilindro.volume(22, 15);

    // probamos os métodos de instancia co obxecto que creamos
    c1.area();
    c1.volume();
  }
}
