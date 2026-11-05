/**
 * U2 Ordenamiento Bubble Sort
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 05/11/2026
 */

import java.util.Arrays;

public class Burbuja {

    // Método para ordenar un arreglo de enteros con Bubble Sort optimizado
    public static void ordenar(int[] arreglo) {
        int n = arreglo.length;
        int totalComparaciones = 0;
        int totalIntercambios = 0;
        int totalPasadas = 0;
        boolean huboIntercambio = true;

        System.out.println("Arreglo Inicial: " + Arrays.toString(arreglo));
        System.out.println("----------------------------------------");

        for (int i = 0; i < n - 1 && huboIntercambio; i++) {
            huboIntercambio = false;
            totalPasadas++;

            for (int j = 0; j < n - 1 - i; j++) {
                totalComparaciones++;
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambio usando variable auxiliar
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;

                    totalIntercambios++;
                    huboIntercambio = true;
                }
            }

            System.out.println("Pasada " + totalPasadas + ": " + Arrays.toString(arreglo));
        }

        System.out.println("----------------------------------------");
        System.out.println("Resumen de Ejecución:");
        System.out.println("Total Pasadas: " + totalPasadas);
        System.out.println("Total Comparaciones: " + totalComparaciones);
        System.out.println("Total Intercambios: " + totalIntercambios);
        System.out.println();
    }

    // Variación opcional para ordenar arreglos de tipo String alfabéticamente
    public static void ordenarStrings(String[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arreglo[j].compareTo(arreglo[j + 1]) > 0) {
                    String aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        System.out.println("Arreglo de Strings Ordenado: " + Arrays.toString(arreglo));
    }
}