package Ejercicios.Estaticos;

public class AppEmpregado {
  public static void main(String[] args) {
    // creamos un obxecto da clase empregado
    Empregado e1 = new Empregado();

    // dámoslle valores aos atributos
    e1.setAntiguidade(5);
    e1.setNome("eu");
    Empregado.setSalario(900);

    // probamos o método non estático
    e1.aumentarSalario();
    Empregado.aumentarSalario(35);
  }
}
