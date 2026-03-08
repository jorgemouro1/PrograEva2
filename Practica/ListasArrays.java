/*
Cree un ArrayList de números enteros.

Añada 10 números aleatorios a la lista.

Muestre todos los números de la lista.

Muestre el número mayor de la lista. */

import java.util.ArrayList;
import java.util.Iterator;

public class ListasArrays {

    public static void main(String[] args) {
        int maximo = 0;

        // creamos a lista e metemos numeros random
        ArrayList<Integer> listilla = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listilla.add((int) (Math.random() * 10));
        }

        // creamos iterador para ir mirando
        Iterator<Integer> iterador = listilla.iterator();
        while (iterador.hasNext()) {
            int numero = iterador.next();
            System.out.println(numero);
        }
        iterador = listilla.iterator();
        while (iterador.hasNext()) {
            int numero = iterador.next();
            if (numero > maximo) {
                maximo = numero;
            }
        }
        System.out.println("O número máximo é: " + maximo);

    }
}
