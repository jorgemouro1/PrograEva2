package Operacion;

public class OperacionsCadeas {

    public static String reves(String cadea1) {
        String cadeareves = "";
        int lonx = cadea1.length();
        for (int i = lonx - 1; i >= 0; i--) { // empeza na última letra, vai metendo 1 a 1 do final o principio
            char letra = cadea1.charAt(i);
            cadeareves += letra; // metemos
        }
        return cadeareves;
    }

    // Crear un método estático chamado sinEspazos que devova a cadea que se pasa
    // como parámetro pero sen ningún espazo en branco.

    public static String sinEspazos(String cadea1) {
        String cadeafinal = ""; // iniciamos o que imos devolver
        for (int i = 0; i >= 0 && i <= cadea1.length() - 1; i++) { // empeza no 0, acaba cando chega ao final da palabra
            char letra = cadea1.charAt(i);
            if (letra != ' ') { // se o caracter é distinto dun espacio, méteo na cadena, senon non
                cadeafinal += letra;
            }
        }
        return cadeafinal;
    }

    /*
     * Crear un método estático chamado palindromo, que indique se a cadea que se
     * pasa como
     * parámetro é palíndroma. Un palíndromo é unha palabra, número ou frase que se
     * le igual
     * de adiante que atrás. Por exemplo, unha palabra palíndroma é Ana ou arenera.
     * Exemplos
     * de frases palíndromas son: “A ti no bonita” ou “Amor a Roma”.
     * Para comprobar que a frase é palíndroma vamos a considerar que non se
     * introduce a frase
     * con acentos. Tamén temos que ter en conta que as maiúsculas ou minúsculas non
     * se teñen
     * en conta para saber se a frase é palíndroma ao igual cos espazos en branco.
     */
    public static boolean palindromo(String cadea1) {
        String cadeaespacios = OperacionsCadeas.sinEspazos(cadea1);
        String crevesespacios = OperacionsCadeas.reves(cadeaespacios);
        if (cadeaespacios.equalsIgnoreCase(OperacionsCadeas.reves(crevesespacios))) {
            return true;
        } else {
            return false;
        }
    }
}
