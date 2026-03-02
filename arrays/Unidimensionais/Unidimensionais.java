/*
Crear un programa en Java que declare un array de números enteiros con 5 valores.,
percorra o array usando un bucle e mostre por pantalla todos os valores do array. Tamén debe
calcular e amosar a suma total dos elementos. */

public class Unidimensionais {
  public static void main(String[] args) {
    // creamos o array
    int[] valores = { 1, 2, 3, 4, 5 };
    int suma = 0;

    // recorremos e enseñamos os valores
    for (int i = 0; i < valores.length; i++) {
      System.out.println("Valor nº " + i + ": " + valores[i]);
    }
    // neste outro bucle imos metendo na variable suma a suma de cada elemento
    for (int i = 0; i < valores.length; i++) {
      suma += valores[i];
    }
    // mostramos a suma
    System.out.println("A suma total dos valores do array é: " + suma);

  }
}
