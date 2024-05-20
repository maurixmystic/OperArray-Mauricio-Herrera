import java.util.Arrays;

public class Visitas {
    public static void main(String[] args) {
        int[] visitasDiarias = Arrays.stream(args).mapToInt(Integer::parseInt).toArray();
        double promedio = calcularPromedio(visitasDiarias);
        System.out.println("El promedio es: " + promedio);
    }

    public static double calcularPromedio(int[] visitasDiarias) {
        double total = Arrays.stream(visitasDiarias).average().orElse(0);
        return total;
    }
}
