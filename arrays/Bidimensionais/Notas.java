
package Bidimensionais;

public class Notas {
  public static void main(String[] args) {
    // ten que ser unha matriz de 10 filas (10 alumnos) e 8 columnas (8 asignaturas)
    int[][] notillas = new int[10][8];
    // para calcular a media total dos alumnos
    double notillaMediaTotal = 0;
    // para calcular a media de cada alumno
    double notillaMediaNormal = 0;
    // para ir recorrendo os bucles e parar ao acabar cada fila
    int contadorNotas = 0;
    // para contar os aprobados
    int contadorAprobados = 0;
    // para contar os suspensos
    int contadorSuspensos = 0;
    // para ir metendo a mellor nota de cada vez no bucle
    int mellorNotilla = 0;
    // para ir metendo a peor nota cada vez no bucle
    int peorNotilla = 10;
    // para os que teñen todas aprobadas
    int todasAprobadas = 0;
    // flag para ver se ten todo aprobado
    boolean tenTodoAprobado = true;

    // imos metendo valores random
    for (int i = 0; i < notillas.length; i++) {
      for (int j = 0; j < notillas[i].length; j++) {
        notillas[i][j] = (int) (Math.random() * 11);
      }
    }
    // mostramolas
    for (int i = 0; i < notillas.length; i++) {
      System.out.println("Fila " + i + "\n\t");
      for (int j = 0; j < notillas[i].length; j++) {
        System.out.print("notas[" + i + "][" + j + "] = " + notillas[i][j] + "\t");
      }
      System.out.println();
    }
    System.out.println("--------------------------");
    // nota media de cada alumno
    for (int i = 0; i < notillas.length; i++) {
      for (int j = 0; j < notillas[i].length; j++) {
        // vai sumando na media cada posicion
        notillaMediaNormal += notillas[i][j];
        // suma no contador
        contadorNotas++;
        // cando o contador chega o numero de filas para, calcula a media e resetease e
        // vai po siguiente alumno
        if (contadorNotas == notillas[i].length) {
          notillaMediaNormal /= notillas[i].length;
          System.out.println("Nota media do alumno " + i + ": " + notillaMediaNormal);
          notillaMediaNormal = 0;
          contadorNotas = 0;
        }
      }
    }
    System.out.println("--------------------------");
    // media total
    for (int i = 0; i < notillas.length; i++) {
      for (int j = 0; j < notillas[i].length; j++) {
        // vai sumando na media cada posicion
        notillaMediaNormal += notillas[i][j];
        // suma no contador
        contadorNotas++;
        // cando o contador chega o numero de filas para, calcula a media e resetease e
        // vai po siguiente alumno
        if (contadorNotas == notillas[i].length) {
          notillaMediaNormal /= notillas[i].length;
          // neste caso imos metendo a media normal na variable total, e despois dividimos
          // e xa o temos
          notillaMediaTotal += notillaMediaNormal;
          notillaMediaNormal = 0;
          contadorNotas = 0;
        }
      }
    }
    System.out.println("Nota media total: " + notillaMediaTotal / 10);
    System.out.println("--------------------------");

    // cantos aprobados hai
    for (int i = 0; i < notillas.length; i++) {
      for (int j = 0; j < notillas[i].length; j++) {
        // vai recorrendo e se é maior ou igual que 5, aumenta o contador
        if (notillas[i][j] >= 5) {
          contadorAprobados++;
        }
      }
    }
    System.out.println("O número de aprobados total é de " + contadorAprobados);
    System.out.println("--------------------------");

    // cantos suspensos hai
    for (int i = 0; i < notillas.length; i++) {
      for (int j = 0; j < notillas[i].length; j++) {
        // o mismo que antes pero o revés
        if (notillas[i][j] < 5) {
          contadorSuspensos++;
        }
      }
    }
    System.out.println("O número de suspensos total é de " + contadorSuspensos);
    System.out.println("--------------------------");

    // mellor nota de todo o curso
    for (int i = 0; i < notillas.length; i++) {
      for (int j = 0; j < notillas[i].length; j++) {
        if (notillas[i][j] > mellorNotilla) {
          mellorNotilla = notillas[i][j];
        }
      }
    }
    System.out.println("A mellor nota do curso é " + mellorNotilla);
    System.out.println("--------------------------");

    // peor nota de todo o curso
    for (int i = 0; i < notillas.length; i++) {
      for (int j = 0; j < notillas[i].length; j++) {
        if (notillas[i][j] < peorNotilla) {
          peorNotilla = notillas[i][j];
        }
      }
    }
    System.out.println("A peor nota do curso é " + peorNotilla);
    System.out.println("--------------------------");

    // comprobar cantos teñen todas aprobadas
    for (int i = 0; i < notillas.length; i++) {
      tenTodoAprobado = true;
      for (int j = 0; j < notillas[i].length; j++) {
        if (notillas[i][j] < 5) {
          tenTodoAprobado = false; // cando ten un suspenso xa para
          break;
        }
      }
      if (tenTodoAprobado) {
        todasAprobadas++;
      }
    }
    System.out.println("Alumnos con todo aprobado: " + todasAprobadas);
  }
}
