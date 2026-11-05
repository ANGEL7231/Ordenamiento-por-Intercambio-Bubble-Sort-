/**
 * U2 Ordenamiento Bubble Sort
 * @author Ángel de Jesús Nolasco Rivera
 * @group GTID244
 * @date 05/11/2026
 */

public class CasosPrueba {
    public static void ejecutarPruebas() {
        System.out.println("=== CASO 1: Arreglo de Ejemplo ===");
        int[] ejemplo = {34, 12, 25, 8, 19};
        Burbuja.ordenar(ejemplo);

        System.out.println("=== CASO 2: Arreglo Ya Ordenado ===");
        int[] ordenado = {8, 12, 19, 25, 34};
        Burbuja.ordenar(ordenado);

        System.out.println("=== CASO 3: Arreglo en Orden Inverso ===");
        int[] inverso = {34, 25, 19, 12, 8};
        Burbuja.ordenar(inverso);

        System.out.println("=== CASO OPCIONAL: Arreglo de Strings ===");
        String[] nombres = {"Sofia", "Carlos", "Ana", "Beatriz"};
        Burbuja.ordenarStrings(nombres);
    }
}