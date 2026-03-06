package Collections.EjClase;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

/*
 * desenvolver un programa en gava que permita xestionar unha lista de enteiros
 * usando un arraylist,
 * deberá
 * crear a lista de obxectos do tipo integer,
 * engadir números ,
 * amosar por pantalla o contido da lista e o seu tamaño, 
 * eliminar por posición ou por valor
 */
public class Chisme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> enteritos = new ArrayList<>();
        Iterator<Integer> iterador = enteritos.iterator();

        boolean meterdatos = true;

        while (meterdatos) {
            System.out.println("1. Engadir números á lista ");
            System.out.println("2. Borrar números da lista ");
            System.out.println("3. Amosar contido e tamaño ");
            System.out.println("0. Saír ");
            System.out.print("Introduce unha opción: ");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    System.out.print("Introduce cantos números queres meter: ");
                    int cantosNumeros = sc.nextInt();
                    for (int i = 0; i < cantosNumeros; i++) {
                        System.out.print("Introduce o número " + i + ": ");
                        int numerosMetidos = sc.nextInt();
                        enteritos.add(numerosMetidos);
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("1. Por posición");
                    System.out.println("2. Por valor");
                    System.out.print("Selecciona unha opción: ");
                    int opcionSubMenu = sc.nextInt();
                    switch (opcionSubMenu) {
                        case 1:
                            System.out.print("Introduce a posición que queres borrar: ");
                            int borrarPosicion = sc.nextInt();
                            enteritos.remove(borrarPosicion);
                            break;
                        case 2:
                            System.out.print("Introduce o valor que queres borrar: ");
                            int borrarValor = sc.nextInt();
                            iterador = enteritos.iterator();

                            while (iterador.hasNext()) {
                                Integer valor = iterador.next();
                                if (borrarValor == valor) {
                                    iterador.remove();
                                }
                            }
                            break;
                        default:
                            System.out.println("Escribe unha opción normal");
                            break;
                    }
                    break;
                case 3:
                    sc.nextLine();
                    iterador = enteritos.iterator();
                    while (iterador.hasNext()) {
                        Integer enteiro = iterador.next();
                        System.out.println(enteiro);
                    }
                    System.out.println("O tamaño da lista é " + enteritos.size());
                    break;
                case 0:
                    System.out.println("Saíndo do programa...");
                    meterdatos = false;
                    break;
                default:
                    System.out.println("Mete un número coma é debido");
                    break;
            }
        }
        sc.close();
    }
}