public class ArrayModificar {
    public static void main(String[] args) {
        int[] arrayEnteiros = new int[8];
        int contadorPares = 0;
        int contadorSegundoArray = 0;
        // añado os elementos ao array, imprimo e vou contando cantos pares hai para ter
        // a lonxitude do seguinte array
        for (int i = 0; i < arrayEnteiros.length; i++) {
            arrayEnteiros[i] = (int) (Math.random() * 10);
            System.out.println(arrayEnteiros[i]);
            if (arrayEnteiros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        int[] arrayPares = new int[contadorPares];
        System.out.println("-------------");
        for (int i = 0; i < arrayEnteiros.length; i++) {
            if (arrayEnteiros[i] % 2 == 0) {
                arrayPares[contadorSegundoArray] = arrayEnteiros[i] * 2;
                contadorSegundoArray++;
            }
        }
        for (int i = 0; i < arrayPares.length; i++) {
            System.out.println(arrayPares[i]);
        }
    }
}
