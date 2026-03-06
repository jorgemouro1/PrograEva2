/*
Deberase crear un programa que realice a xestión dunha biblioteca. Isto é:
 Engadir un novo libro.
 Borrar o libro que teña unha signatura determinada.
 Modificar algún campo dun libro que teña unha signatura determinada.
 Buscar os libros cuxo título empece polo texto introducido polo usuario.
O programa comezará cunha biblioteca baleira e deberá mostrar ao comezo un menú para
que o usuario seleccione a opción a realizar.
Os nodos da biblioteca son de tipo libro e cada un ten as seguintes características:
 Signatura: texto que reflicte a nomenclatura asignada ao libro na biblioteca.
 Título: texto que representa ao título do libro.
 Editorial: editorial á que pertence o libro.
 Autor: ou autores, separados por comas.
 ISBN: en formato número e sen guións.
 Páxinas: número de páxinas do libro. */
package Collections.Ej1;

public class Librillo {
  private String signatura;
  private String titulo;
  private String editorial;
  private String autor;
  private int ISBN;
  private int paxinas;

  // constructor

  public Librillo(String signatura, String titulo, String editorial, String autor, int iSBN, int paxinas) {
    this.signatura = signatura;
    this.titulo = titulo;
    this.editorial = editorial;
    this.autor = autor;
    ISBN = iSBN;
    this.paxinas = paxinas;
  }

  // getters e setters
  public String getSignatura() {
    return signatura;
  }

  public void setSignatura(String signatura) {
    this.signatura = signatura;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getEditorial() {
    return editorial;
  }

  public void setEditorial(String editorial) {
    this.editorial = editorial;
  }

  public int getISBN() {
    return ISBN;
  }

  public void setISBN(int iSBN) {
    ISBN = iSBN;
  }

  public int getPaxinas() {
    return paxinas;
  }

  public void setPaxinas(int paxinas) {
    this.paxinas = paxinas;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void mostrarInfo() {
    System.out.println("Signatura: " + this.signatura + " Título: " + this.titulo + " Editorial: " + this.editorial
        + " Autor: " + this.autor + " ISBN: " + this.ISBN + " Páxinas: " + this.paxinas);
  }
}
