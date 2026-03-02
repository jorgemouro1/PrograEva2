import java.util.Scanner;

public class DNI {
  public static boolean comprobarDNI(int numero, char letra) {
    int resto = 0;
    // metemos o array das letras
    char[] letrillas = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
        'L', 'C', 'K', 'E' };
    // miramos o resto
    resto = numero % 23;
    // se a letra na posicion do resto coincide ca letra que lle metemos é true,
    // senon false
    if (letrillas[resto] == letra) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero = 0;
    char letra = ' ';
    System.out.print("Introduce o teu número do DNI (sen a letra): ");
    numero = sc.nextInt();
    System.out.print("Introduce a letra do DNI: ");
    letra = sc.next().charAt(0);

    System.out.println(comprobarDNI(numero, letra));
    sc.close();
  }
}
