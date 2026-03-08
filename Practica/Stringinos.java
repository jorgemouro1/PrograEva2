import java.util.Scanner;

public class Stringinos {
    // non nos especifican se teñen que ser iguales tal cual ou sin contar
    // maiusculas, neste caso eu teño en conta as maiusculas
    public static boolean verIguais(String cadea1, String cadea2) {
        if (cadea1.equals(cadea2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean verConten(String cadea1, String cadea2) {
        if (cadea1.contains(cadea2)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce o primeiro texto: ");
        String texto1 = sc.nextLine();
        System.out.print("Introduce o segundo texto: ");
        String texto2 = sc.nextLine();

        System.out.println("Iguais?: " + Stringinos.verIguais(texto1, texto2));
        System.out.println("Contén?: " + Stringinos.verConten(texto1, texto2));
        System.out.println("Primeira ocorrencia: " + texto1.indexOf(texto2));
        sc.close();
    }
}
