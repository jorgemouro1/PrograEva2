package Collections.Ej1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class AppLibrillo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean meterdatos = true;
    int opcion;
    ArrayList<Librillo> listaLibrillos = new ArrayList<>();

    while (meterdatos) {
      System.out.println("---------- MENÚ ----------");
      System.out.println("1. Engadir un libro");
      System.out.println("2. Borrar un libro por signatura");
      System.out.println("3. Modificar campos por signatura");
      System.out.println("4. Buscar libros por texto inicial");
      System.out.println("5. Mostrar lista de libros");
      System.out.println("0. Salir");

      System.out.print("Introduce unha opción: ");
      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          sc.nextLine();
          System.out.print("Introduce a signatura: ");
          String signUsuario = sc.nextLine();

          System.out.print("Introduce o título: ");
          String titUsuario = sc.nextLine();

          System.out.print("Introduce a editorial: ");
          String editUsuario = sc.nextLine();

          System.out.print("Introduce o autor: ");
          String autorUsuario = sc.nextLine();

          System.out.print("Introduce o ISBN: ");
          int isbnUsuario = sc.nextInt();

          System.out.print("Introduce o nº de páxinas: ");
          int paxUsuario = sc.nextInt();

          Librillo libro1 = new Librillo(signUsuario, titUsuario, editUsuario, autorUsuario, isbnUsuario, paxUsuario);
          listaLibrillos.add(libro1);

          libro1.mostrarInfo();
          break;
        case 2:
          sc.nextLine();
          System.out.print("Introduce a signatura do libro que queres borrar: ");
          String signaturaBorrar = sc.nextLine();
          Iterator<Librillo> iterador = listaLibrillos.iterator();
          while (iterador.hasNext()) {
            Librillo librito = iterador.next();
            if (librito.getSignatura().equalsIgnoreCase(signaturaBorrar)) {
              iterador.remove();
            }
          }
          break;

        case 3:
          sc.nextLine();
          System.out.print("Introduce a sinatura do libro que queres: ");
          String sinaturaBuscar = sc.nextLine();
          iterador = listaLibrillos.iterator();
          while (iterador.hasNext()) {
            Librillo libritoCambiar = iterador.next();
            if (libritoCambiar.getSignatura().equalsIgnoreCase(sinaturaBuscar)) {
              System.out.println("Elixe que campo queres cambiar: ");
              System.out.println("1. Título");
              System.out.println("2. Editorial");
              System.out.println("3. Autor");
              System.out.println("4. ISBN");
              System.out.println("5. Páxinas");

              System.out.print("Introduce a túa opción (número): ");
              int opcionCambio = sc.nextInt();
              if (opcionCambio == 1) {
                System.out.print("Introduce o novo título: ");
                String novoTitulo = sc.nextLine();
                libritoCambiar.setTitulo(novoTitulo);
              } else if (opcionCambio == 2) {
                System.out.print("Introduce a nova editorial: ");
                String novaEditorial = sc.nextLine();
                libritoCambiar.setEditorial(novaEditorial);
              } else if (opcionCambio == 3) {
                System.out.print("Introduce o novo autor: ");
                String novoAutor = sc.nextLine();
                libritoCambiar.setAutor(novoAutor);
              } else if (opcionCambio == 4) {
                System.out.print("Introduce o novo ISBN: ");
                int novoISBN = sc.nextInt();
                libritoCambiar.setISBN(novoISBN);
              } else if (opcionCambio == 5) {
                System.out.print("Introduce o novo nº de pax: ");
                int novasPax = sc.nextInt();
                libritoCambiar.setPaxinas(novasPax);
              } else {
                System.out.println("Introduce unha opción válida");
              }
            }
          }
          break;
        case 4:
          sc.nextLine();
          System.out.print("Introduce o cacho do título: ");
          String cacho = sc.nextLine();
          iterador = listaLibrillos.iterator();
          while (iterador.hasNext()) {
            Librillo libroBuscar = iterador.next();
            if (libroBuscar.getTitulo().startsWith(cacho)) {
              libroBuscar.mostrarInfo();
            }
          }
          break;
        case 5:
          sc.nextLine();
          System.out.println("-------- Lista de libros --------");
          iterador = listaLibrillos.iterator();
          while (iterador.hasNext()) {
            Librillo librimostrar = iterador.next();
            librimostrar.mostrarInfo();
          }
          break;
        case 0:
          System.out.println("Saíndo...");
          meterdatos = false;
          break;
        default:
          System.out.println("Introduce unha opción válida");
          break;
      }
    }
  }
}
