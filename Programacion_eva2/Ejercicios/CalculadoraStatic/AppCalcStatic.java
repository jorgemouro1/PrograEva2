package Ejercicios.CalculadoraStatic;

public class AppCalcStatic {
  public static void main(String[] args) {

    // aplicamos os métodos static directamente á clase
    Calculadora.sumar(5, 3);
    Calculadora.restar(10, 4);
    Calculadora.multiplicar(6, 7);
    Calculadora.dividir(8, 2);
    Calculadora.dividir(8, 0);

  }
}
