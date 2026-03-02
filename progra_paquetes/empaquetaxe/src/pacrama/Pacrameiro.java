package pacrama;

import cadelo.Proba;

public class Pacrameiro {
  public static void main(String[] args) {
    Proba p2 = new Proba();
    System.out.println(p2.atributoPublico);
    // System.out.println(p1.atributoPrivado); é privado solo se pode acceder desde
    // a propia clase
    // System.out.println(p2.atributoDefecto);

    // System.out.println(p2.metodoDefecto()); //a estes solo se pode acceder desde
    // o mesmo paquete
    // System.out.println(p1.metodoPrivado());
    System.out.println(p2.metodoPublico());
  }
}
