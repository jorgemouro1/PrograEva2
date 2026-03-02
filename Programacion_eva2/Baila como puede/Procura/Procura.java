
import java.util.Scanner;

/*
Nesta tarefa crearase:
 Un método estático que nos permita facer a lectura de dous correos electrónicos e comprobar que ambos son iguais, aínda que entre eles non se correspondan as maiúsculas e
as minúsculas.
 Un programa principal que faga uso do método para solicitar e comprobar os dous correos por parte usuario. Deberá mostrar o resultado de comprobar os dous correos.
O método deberá solicitar a introdución dun correo desde a consola. A continuación pedirá
unha confirmación do mesmo. Unha vez lidos deberá comprobar que son iguais.
Para implementar o método de comprobación do correo deberán terse en conta as seguintes consideracións:
 En caso de que non se introduza un correo deberá volver a solicitarse.
 Os dous correos deben ter a mesma lonxitude e conter os mesmos caracteres.
 Deberá comprobarse que se trata dun correo electrónico. Esta comprobación será moi
básica, e consistirá simplemente en que a cadea conteña nalgunha posición intermedia o
carácter ‘@’, este carácter só pode aparecer unha vez.
 A saída do método será un valor booleano:
– true: cando os dous correos coincidan e sexan correctos.
– false: en caso contrario.
 */
public class Procura {
  static Scanner sc = new Scanner(System.in);

  public static boolean lecturaCorreo() {
    String correo1;
    String correo2;
    int contadorarroba = 0;

    do { // metemos os correos, hasta que non estén baldeiros
      System.out.print("Introduce o teu correo: ");
      correo1 = sc.nextLine();
      System.out.print("Confirma o teu correo: ");
      correo2 = sc.nextLine();
    } while (correo1.isEmpty() || correo2.isEmpty());

    if (correo1.length() != correo2.length()) { // primeiro miramos se teñen a mesma lonxitude. senon, para e devolve
                                                // false
      System.out.println("Os correos non teñen a misma lonxitude");
      return false;
    } else if (!correo1.contains("@") || !correo2.contains("@")) {// despois miramos se non conten @
      System.out.println("O teu correo non ten @");
      return false;
    } else if (correo1.endsWith("@") || correo2.startsWith("@")) { // agora miramos que nin empece nin acabe por @
      System.out.println("O teu correo non é válido");
      return false;
    } else if (correo1.contains("@") && correo2.contains("@")) { // agora se as duas conteñen @
      for (int i = 0; i < correo1.length(); i++) { // vai contando as @
        if (correo1.charAt(i) == 64) {
          contadorarroba++;
        }
      }
      System.out.println("Número de @: " + contadorarroba);
      if (contadorarroba > 1) { // se hai mais de 1 para e devolve false
        System.out.println("O teu correo ten máis de unha @, non é válido");
        return false;
      } else { // senon mira se son iguais, e se o son, devolve true
        if (correo1.equalsIgnoreCase(correo2)) {
          System.out.println("Os correos son iguais");
          return true;
        }
      }

    }

    return false;
  }

}
