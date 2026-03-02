package Ejercicios.Estaticos;

public class Empregado {
  private String nome;
  private int antiguidade;
  private static double salario; // creamos o atributo static salario
  private final int dez = 10;

  // getters e setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getAntiguidade() {
    return antiguidade;
  }

  public void setAntiguidade(int antiguidade) {
    this.antiguidade = antiguidade;
  }

  public static double getSalario() {
    return salario;
  }

  public static void setSalario(double salario) {
    Empregado.salario = salario;
  }

  // método para aumentar o salario según a porcentaxe indicada
  public static double aumentarSalario(double porcentaxe) {
    salario = salario + (salario * (porcentaxe / 100));
    System.out.println("Aumentouse o salario un " + porcentaxe + "% e o total é: " + salario);
    return salario;
  }

  // método que aumenta o salario dun empregado en particular
  public double aumentarSalario() {
    Empregado.setSalario(salario + (dez * antiguidade));
    System.out.println(
        "O salario de " + this.getNome() + " aumentou a " + salario + " tras " + antiguidade + " anos de antiguidade");
    return Empregado.getSalario();
  }

}
