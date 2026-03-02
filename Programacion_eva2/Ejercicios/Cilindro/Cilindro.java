package Ejercicios.Cilindro;

public class Cilindro {
  private double radio;
  private double altura;

  // definimos pi con math.pi
  static final double pi = Math.PI;

  // getters e setters
  public double getAltura() {
    return altura;
  }

  public double getRadio() {
    return radio;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  // empezo a facer os metodos static

  public static void area(double r, double h) {
    System.out.println("A área do cilindro de radio " + r + " e altura " + h + " é: " + (2 * pi * r * (r + h)));
  }

  public static void volume(double r, double h) {
    System.out.println("O volumen do cilindro de radio " + r + " e altura " + h + " é: " + (pi * r * r * h));
  }

  // ahora os métodos de instancia.

  public void area() {
    double area = 0; // creo unha variable área para almacenar o valor e imprimilo despois
    area = 2 * pi * this.getRadio() * (this.getRadio() + this.getAltura());
    System.out
        .println("A área do cilindro de radio " + this.getRadio() + " e altura " + this.getAltura() + " é: " + area);
  }

  public void volume() {
    double volume = 0; // creo unha variable volume para almacenar o valor e imprimilo mais tarde
    volume = pi * this.getRadio() * this.getRadio() * this.getAltura();
    System.out
        .println(
            "O volume do cilindro de radio " + this.getRadio() + " e altura " + this.getAltura() + " é: " + volume);
  }
}
