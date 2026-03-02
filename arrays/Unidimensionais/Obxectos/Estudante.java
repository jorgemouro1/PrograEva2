package Obxectos;

/*Programa en Java que garde información de varios estudantes (nome, idade e nota final).
Para iso débese crear unha clase Estudante, despois un array de obxectos desa clase, e finalmente mostrar os datos. */
public class Estudante {
  private String nome;
  private int idade;
  private int notaFinal;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getNotaFinal() {
    return notaFinal;
  }

  public void setNotaFinal(int notaFinal) {
    this.notaFinal = notaFinal;
  }

  public Estudante(String nome, int idade, int notaFinal) {
    this.nome = nome;
    this.idade = idade;
    this.notaFinal = notaFinal;
  }

  void mostrarInformacion() {
    System.out.println("Nome: " + this.nome + ", idade: " + this.idade + ", nota final: " + this.notaFinal);
  }

  public static void main(String[] args) {
    Estudante estudantes[] = new Estudante[3];

    estudantes[0] = new Estudante("Jorge", 20, 10);
    estudantes[1] = new Estudante("Anxo", 19, 10);
    estudantes[2] = new Estudante("Alberto", 90, 10);
    System.out.println("Lista de estudantes:");
    for (int i = 0; i < estudantes.length; i++) {
      estudantes[i].mostrarInformacion();
    }
  }
}
