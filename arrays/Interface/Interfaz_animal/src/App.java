public class App {
  public static void main(String[] args) throws Exception {
    Gato g = new Gato();
    g.facerSon();

    Can c = new Can();
    c.facerSon();

    Animal a = new Gato();
    a.facerSon();
    Animal[] animais = new Animal[3];
    animais[0] = new Gato();
    animais[1] = new Can();
    animais[2] = new Vaca();

    animais[0].facerSon();
    animais[1].facerSon();
    animais[2].facerSon();
  }
}
