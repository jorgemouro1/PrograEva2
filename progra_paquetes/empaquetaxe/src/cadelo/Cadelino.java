package cadelo;

public class Cadelino {
  public static void main(String[] args) {
    Proba p1 = new Proba();
    System.out.println(p1.atributoPublico);
    // System.out.println(p1.atributoPrivado); é privado solo se pode acceder desde
    // a propia clase
    System.out.println(p1.atributoDefecto);

    System.out.println(p1.metodoDefecto());
    // System.out.println(p1.metodoPrivado());
    System.out.println(p1.metodoPublico());
  }
}
