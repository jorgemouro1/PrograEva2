import java.util.Random;

public class ArrayMedia {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[10];
        double contadorMedia = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(0, 11);
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        for (int i = 0; i < array1.length; i++) {
            contadorMedia += array1[i];
        }
        System.out.println("A media é: " + contadorMedia / array1.length);
    }
}
