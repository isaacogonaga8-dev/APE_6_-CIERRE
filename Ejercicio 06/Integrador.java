import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] datos = {14, 7, 25, 3, 18};

        int[] copia = Arrays.copyOf(datos, datos.length);
        Arrays.sort(copia);

        System.out.println("Original: " + Arrays.toString(datos));
        System.out.println("Copia ordenada: " + Arrays.toString(copia));

        System.out.println("Segundo mayor: " + copia[copia.length - 2]);
        System.out.println("Posición del 14: " + Arrays.binarySearch(copia, 14));
    }
}
