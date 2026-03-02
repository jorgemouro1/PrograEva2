public class Invertir {
  public static void inversion(char[] arrai) {
    // creamos un caracter auxiliar
    char auxiliar = ' ';

    // miramos hasta a mitade para que non cambie o que xa temos cambiado
    for (int i = 0; i < arrai.length / 2; i++) {
      // metemos o primeiro valor na auxiliar
      auxiliar = arrai[i];
      // no primeiro poño o ultimo, no segundo o penultimo etc restandolle a posicion
      arrai[i] = arrai[arrai.length - i - 1];
      arrai[arrai.length - i - 1] = auxiliar;
    }
  }

  public static void main(String[] args) {
    char[] letrillas = { 'a', 'b', 'c', 'd', 'e', 'f' };
    inversion(letrillas);
    for (int i = 0; i < letrillas.length; i++) {
      System.out.println(letrillas[i]);
    }
  }
}
