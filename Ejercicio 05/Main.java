public class MaximoMinimoParalelos {

    public static void main(String[] args) {
        String[] nombres = {"Ana", "Luis", "Marta", "Pedro"};
        int[] notas = {15, 8, 18, 11};

        int posMax = 0;
        int posMin = 0;
        int suma = notas[0];

        for (int i = 1; i < notas.length; i++) {
            suma += notas[i];

            if (notas[i] > notas[posMax]) {
                posMax = i;
            }
            if (notas[i] < notas[posMin]) {
                posMin = i;
            }
        }

        double promedio = (double) suma / notas.length;

        System.out.println("Nota más alta: " + notas[posMax] + " (" + nombres[posMax] + ")");
        System.out.println("Nota más baja: " + notas[posMin] + " (" + nombres[posMin] + ")");
        System.out.printf("Promedio: %.2f%n", promedio);
    }
}
