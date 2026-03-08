public class Estaticos {
    public static int contarVocales(String cadea) {
        cadea = cadea.toLowerCase();
        cadea = cadea.trim();
        int contadorVocales = 0;
        for (int i = 0; i < cadea.length(); i++) {
            if (cadea.charAt(i) == 'a' || cadea.charAt(i) == 'e' || cadea.charAt(i) == 'i' || cadea.charAt(i) == 'o'
                    || cadea.charAt(i) == 'u') {
                contadorVocales++;
            }
        }
        return contadorVocales;
    }

    public static void main(String[] args) {
        String saludo = "hola que tal";
        System.out.println("O nº de vogais na túa cadea é: " + contarVocales(saludo));

    }
}
