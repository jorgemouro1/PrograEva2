
public class TipoExamen3 {
    public static int arrayMaior(int[] arrayPro) {
        // empezo a variable en 0, porque sei que o array que se vai introducir é de
        // enteiros positivos
        int maior = 0;
        for (int i = 0; i < arrayPro.length; i++) {
            if (arrayPro[i] > maior) {
                maior = arrayPro[i];
            }
        }
        return maior;
    }

    public static void main(String[] args) {
        int[] arraycillo = new int[10];
        for (int i = 0; i < arraycillo.length; i++) {
            arraycillo[i] = (int) (Math.random() * 50) + 1;
            System.out.println(arraycillo[i]);
        }
        System.out.println("O número maior é " + arrayMaior(arraycillo));
    }
}
