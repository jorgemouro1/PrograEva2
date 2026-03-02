/*
Crear un método que cree un array de caracteres e que conte el número de vocais que hai
nese array de caracteres. Crear un programa principal que chame ao método e mostre o resultado devolto. 
*/
public class VogaisArrays {
  static int contadorvogais = 0;

  // metodo para ir mirando as vocais
  public static int mirarVogais() {
    // creamos o array
    char[] exemplo = { 'p', 'a', 'c', 'r', 'a', 'm', 'a' };
    for (char valor : exemplo) {
      // se é vocal vai sumando o contador
      if (valor == 'a' || valor == 'e' || valor == 'i' || valor == 'o' || valor == 'u' || valor == 'A' || valor == 'E'
          || valor == 'I' || valor == 'O' || valor == 'U') {
        contadorvogais++;
      }
    }
    // devolve o contador
    return contadorvogais;
  }

  public static void main(String[] args) {
    // mostramos o resultado
    System.out.println(mirarVogais());
  }
}
