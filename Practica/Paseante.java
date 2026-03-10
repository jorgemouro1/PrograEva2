public class Paseante {
  public static void main(String[] args) {
    // creamos o stringbuilder
    StringBuilder paseantillo = new StringBuilder("Bo día paseante");
    // a capacidade vai ser o que ocupa +16
    System.out.println("A capacidade do StringBuilder é: " + paseantillo.capacity());
    // a lonxitude si que é o num de caracteres
    System.out.println("A lonxitude do StringBuilder é: " + paseantillo.length());

    // ahora temos que cambiar a cadea a "Bo día aos 3000 paseantes e mostrala. O
    // 3000 debe ser un int"
    int numerillo = 3000;
    // primeiro meto o dos 3000
    paseantillo.insert(6, " aos " + numerillo);
    // despois meto a s do plural
    paseantillo.append("s");
    System.out.println(paseantillo);

    // ahora metemosllo a zona vella
    paseantillo.append(" da zona vella");
    System.out.println(paseantillo);

    // temos que crear un string coas 10 ultimas letras da cadea anterior e mostralo
    String paseanteStringillo = paseantillo.substring(paseantillo.length() - 10);
    System.out.println(paseanteStringillo);
  }
}
