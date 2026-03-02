package Ejercicios.CalculadoraStatic;

/*Crear unha clase sen atributos chamada Calculadora que conteña métodos estáticos para
realizar as seguintes operacións matemáticas:
 Sumar dous números
 Restar dous números
 Multiplicar dous números
Dividir dous números (controlando que o segundo non sexa cero)
Non se deben crear obxectos da clase Calculadora.
A continuación, crea un pequeno programa que faga uso destes métodos para:
– Sumar 5 e 3
– Restar 10 e 4
– Multiplicar 6 e 7
– Dividir 8 entre 2
– Dividir 8 entre 0 (e mostrar unha mensaxe de erro se é o caso)
 */
public class Calculadora {
  // creamos o método Sumar, témoslle que meter a e b, e devolve a suma.
  public static void sumar(double a, double b) {
    System.out.println("A suma de " + a + " e " + b + " é " + (a + b));
  }

  // creamos restar facendo o mesmo
  public static void restar(double a, double b) {
    System.out.println("A resta de " + a + " e " + b + " é " + (a - b));
  }

  // multiplicación
  public static void multiplicar(double a, double b) {
    System.out.println("O producto de " + a + " e " + b + " é " + (a * b));
  }

  // agora a división, hai que facer a comprobación para non dividir entre 0
  public static void dividir(double a, double b) {
    if (b == 0) {
      System.out.println("Non podes dividir " + a + " entre 0");
    } else {
      System.out.println("A división de " + a + " e " + b + " é: " + a / b);
    }
  }
}
