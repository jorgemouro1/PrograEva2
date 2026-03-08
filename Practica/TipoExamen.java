/*
Cree un array de 12 números enteros.

Lo rellene con números aleatorios entre 1 y 20.

Muestre todos los números del array.

Cuente cuántos números son mayores que la media.

Muestre ese resultado. */

public class TipoExamen {
    public static void main(String[] args) {
        // creamos array
        int[] numeritos = new int[12];
        // variable media para ir gardando o valor
        double media = 0;
        // contador para ir vendo cantos valores superan a media
        int contadorMedia = 0;
        // imos metendo numeros
        for (int i = 0; i < numeritos.length; i++) {
            numeritos[i] = (int) (Math.random() * 20) + 1;
            // vou metendo o número na variable media, despois xa divido
            System.out.println("Elemento " + i + " do array: " + numeritos[i]);
            media += numeritos[i];
        }
        media = media / numeritos.length;
        for (int i = 0; i < numeritos.length; i++) {
            if (numeritos[i] > media) {
                contadorMedia++;
            }
        }
        System.out.println("A media é " + media + " e hai " + contadorMedia + " números maiores que a media");
    }
}