package Collections.Proba;

public class Alumno {
  String dni;
  String nome;
  String curso;
  int idade;

  Alumno(String dni, String nome, String curso, int idade) {
    this.dni = dni;
    this.nome = nome;
    this.curso = curso;
    this.idade = idade;
  }

  @Override
  // Método equals para comparar dous obxectos Alumno
  public boolean equals(Object al) {
    // Variable que gardará o resultado da comparación
    // Inicialmente asumimos que non son iguais (false)
    boolean rdo = false;

    // Comprobamos se o obxecto recibido é unha instancia da clase Alumno
    // Isto é necesario porque o parámetro é de tipo Object (pode ser calquera cosa)
    if (al instanceof Alumno) {
      // Se é un Alumno, comparamos os DNIs
      // Facemos casting a Alumno para poder acceder ao campo 'dni'
      // e comparamos co DNI do obxecto actual (this.dni)
      rdo = (dni.equals(((Alumno) al).dni));
    }

    // Devolvemos o resultado da comparación
    // Será true só se:
    // 1. 'al' é un Alumno
    // 2. O DNI de ambos é igual
    // En calquera outro caso, será false
    return rdo;
  }
}
