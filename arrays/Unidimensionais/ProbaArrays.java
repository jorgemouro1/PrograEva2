public class ProbaArrays {
  public static void main(String[] args) {
    // creamos o array de semana
    String[] semana = new String[7];
    // metemos os datos
    semana[0] = "Luns";
    semana[1] = "Martes";
    semana[2] = "Mércores";
    semana[3] = "Xoves";
    semana[4] = "Venres";
    semana[5] = "Sábado";
    semana[6] = "Domingo";

    for (int i = 0; i < semana.length; i++) {
      System.out.println("Posición " + i + " da semana: " + semana[i] + " ");
    }

    System.out.println("-------------------------------------------------------------");

    for (String valor : semana) {
      System.out.println(valor + " ");
    }

    System.out.println("-------------------------------------------------------------");

    // ahora creamos meses e metemos os datos directamente
    String[] meses = { "Xaneiro", "Febreiro", "Marzo", "Abril", "Maio", "Xuño", "Xullo", "Agosto", "Setembro",
        "Outubro", "Novembro", "Decembro" };

    for (int i = 0; i < meses.length; i++) {
      System.out.println("Posición " + i + " do array meses: " + meses[i] + " ");
    }

    System.out.println("-------------------------------------------------------------");

    for (String valormeses : meses) {
      System.out.println(valormeses + " ");
    }

    System.out.println("-------------------------------------------------------------");
    System.out.println("Antes de maiusculas: ");

    for (String valor : semana) {
      System.out.println(valor);
    }

    System.out.println("-------------------------------------------------------------");
    for (int i = 0; i < semana.length; i++) {
      semana[i] = semana[i].toUpperCase();
    }

    System.out.println("Despois de maiúsculas: ");
    for (String valor : semana) {
      System.out.println(valor + " ");
    }

    System.out.println("-------------------------------------------------------------");

    for (String valor : meses) {
      valor = valor.toUpperCase();
    }
    for (String valor : meses) {
      System.out.println(valor + " ");
    }
  }

}
