import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = {14, 7, 25, 3, 18, 7, 30};
        
        System.out.print("Ingresa el número a buscar: ");
        int buscado = sc.nextInt();
        
        int contador = 0;
        int posicion = -1;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                contador++;
                if (posicion == -1) {
                    posicion = i;
                }
            }
        }
        
        if (posicion != -1) {
            System.out.println("El número " + buscado + " aparece " + contador + " vez/veces.");
            System.out.println("Su primera posición (índice) es: " + posicion);
        } else {
            System.out.println("No existe");
        }
        
        sc.close();
    }
}
