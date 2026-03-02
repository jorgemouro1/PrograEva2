package Ejercicios;

//lea 2 cadenas por teclado e q as concatene das 2 formasq calcule a lonxitude da concatenada e q mostre para cada posicion o caracter asignado 

//comprobar con equals, facer unha vacia e mirar se esta vacia, compareTo
import java.util.Scanner;

public class Concatenar {
  public static void main(String[] args) {
    // poñemos o scanner e metemos as cadenas
    Scanner sc = new Scanner(System.in);
    System.out.print("Escribe algo bonito: ");
    String cad1 = sc.nextLine();
    System.out.print("Escribe a continuación: ");
    String cad2 = sc.nextLine();
    System.out.print("Non escribas nada: ");
    String cadvacia = sc.nextLine();

    // aqui e onde vou ir concatenando as cadenas
    String cadconcat1;
    String cadconcat2;

    // concatenamos con +
    cadconcat1 = cad1 + " " + cad2;
    System.out.println("Concatenado con +: " + cadconcat1);

    // concatenamos con concat
    cadconcat2 = cad1.concat(" " + cad2);
    System.out.println("Concatenado con concat: " + cadconcat2);

    // Mostramos a lonxitude con lenght
    System.out.println("A lonxitude da cadena concatenada é: " + cadconcat1.length());
    // facemos un bucle para q vaia contando as posicións e vaia decindo q caracter
    // hai en cada unha
    for (int i = 0; i < cadconcat1.length(); i++) {
      System.out.println("Posición " + i + " " + cadconcat1.charAt(i));
    }
    // miramos se algunha está baldeira
    System.out.println("A cadea concatenada está baleira (isEmpty)? " + cadconcat1.isEmpty());
    System.out.println("A terceira cadea está baleira? " + cadvacia.isEmpty());
    System.out.println("A cadea 1 está baleira (comparando ca terceira)? " + cadconcat1.equals(cadvacia));

    // ahora probamos compareto e equals
    System.out.println("Son iguais cad1 e cad2 alfabeticamente?: " + cad1.compareTo(cad2));
    System.out
        .println("Son iguais cad1 e cad2 alfabeticamente ignorando maiusculas?: " + cad1.compareToIgnoreCase(cad2));

    System.out.println("Son iguais cad1 e cad2 (equals)?: " + cad1.equals(cad2));
    System.out.println("Son iguais cad1 e cad2 ignorando maiusculas?: " + cad1.equalsIgnoreCase(cad2));

    System.out.println("----------- PARTE 2 -----------");

    System.out.println("Cadena 1 a maiúsculas: " + cad1.toUpperCase());
    System.out.println("Cadena 1 a minúsculas outra vez: " + cad1.toLowerCase());

    System.out.println("Cambiamos as letras a por e: " + cad1 + " pasa a ser: " + cad1.replace('a', 'e'));

    String caca = String.valueOf(67);
    System.out.println("67 en string: " + caca);

    System.out.println("----------- PROCURA DE CARACTERES -----------");

    System.out.println("O carácter na posición 6 é: " + cad1.charAt(6));
    System.out.println("O unicode da posición 6 é: " + cad1.codePointAt(6));
    System.out.println(cad1.indexOf("anxo"));
    if (cad1.contains("hola")) {
      System.out.println("hola está na cadena");
    } else {
      System.out.println("falta hola");
    }

    if (cad1.startsWith("hola")) {
      System.out.println("A cadena empeza por hola");
    } else {
      System.out.println("A cadena non empeza por hola");
    }

    if (cad1.endsWith("adios")) {
      System.out.println("A cadena acaba por adios");
    } else {
      System.out.println("A cadena non acaba por adios");
    }

    String texto = " Ola mundo ";
    System.out.println("'" + texto.trim() + "'"); // 'Ola mundo'
    System.out.println(texto.trim().substring(4)); // "mundo"
    System.out.println(texto.trim().substring(0, 3)); // "Ola"

    System.out.println("Liña 1\nLiña 2");
    System.out.println("Columna1\tColumna2");
    System.out.println("Camiño: C:\\Usuarios\\Ti");
    System.out.println("Ela dixo: ey");

    sc.close();
  }
}
