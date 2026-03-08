import java.util.Scanner;

public class Invertir {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce a túa cadea: ");
        String textoIntroducido = sc.nextLine();
        StringBuilder textoNormal = new StringBuilder(textoIntroducido);
        System.out.println(textoNormal.reverse());
        sc.close();
    }
}
