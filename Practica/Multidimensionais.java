/*
Cree una matriz de 3 filas y 3 columnas.

La rellene con números aleatorios.

Muestre la matriz en forma de tabla.

Calcule y muestre la suma de todos los elementos. */
public class Multidimensionais {
    public static void main(String[] args) {
        int arrayProba[][] = new int[3][3];
        int contadorSuma = 0;
        // con i miramos as filas,e con j os elementos de cada fila
        // vou metendo numeros e mostrando

        for (int i = 0; i < arrayProba.length; i++) {
            for (int j = 0; j < arrayProba[i].length; j++) {
                arrayProba[i][j] = (int) (Math.random() * 10);
                System.out.println("Posición " + i + ", " + j + ": " + arrayProba[i][j]);
                contadorSuma += arrayProba[i][j];
            }
            System.out.println();
        }
        System.out.println("A suma dos elementos é de: " + contadorSuma);
    }
}
