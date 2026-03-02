package Ejercicios.CantasVeces;

public class Aparicions {

  public static int aparicionsPalabra(String texto1, String palabraClave) {
    int posicion = 0;
    int cantos = 0;
    texto1 = texto1.toLowerCase();
    palabraClave = palabraClave.toLowerCase();
    int index = texto1.indexOf(palabraClave, posicion);
    if (index == -1) { // primeiro miramos se contén a subcadena
      System.out.println("A cadena non contén esa secuencia");
    }
    while (index != -1) { // neste bucle, q dura mentras o indexof encontre a subcadena, vai sumando cada
                          // vez a un contador e aparte actualiza a posición desde onde se empeza
      cantos++;
      posicion = index + palabraClave.length();
      index = texto1.indexOf(palabraClave, posicion);
    }

    return cantos;
  }
}
