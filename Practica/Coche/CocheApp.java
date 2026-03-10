package Coche;

import java.util.ArrayList;
import java.util.Iterator;

public class CocheApp {
  public static void main(String[] args) {
    ArrayList<Coche> coches = new ArrayList<>();
    Coche c1 = new Coche("Opel", "Corsa", 2021);
    Coche c2 = new Coche("Seat", "Ibiza", 2050);
    Coche c3 = new Coche("Peugeot", "207", 2010);

    coches.add(c1);
    coches.add(c2);
    coches.add(c3);

    Iterator<Coche> it = coches.iterator();
    while (it.hasNext()) {
      Coche cochecillo = it.next();
      cochecillo.mostrarCoche();
    }
  }
}
