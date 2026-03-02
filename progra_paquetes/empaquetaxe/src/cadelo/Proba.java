package cadelo;

public class Proba {
  public String atributoPublico = "Este atributo é público";
  String atributoDefecto = "Este atributo está por defecto";
  private String atributoPrivado = "Este atributo é privado";

  public String metodoPublico() {
    return "baila como puede";
  }

  String metodoDefecto() {
    return "feigó";
  }

  private String metodoPrivado() {
    return "feliz pacrama";
  }
}
