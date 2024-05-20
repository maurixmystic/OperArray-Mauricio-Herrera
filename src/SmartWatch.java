import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SmartWatch {
    public static void main(String[] args) {
        List<Integer> pasosFiltrados = filtrarPasos(args);
        System.out.println("Pasos realizados: " + pasosFiltrados);
        double promedio = calcularPromedio(pasosFiltrados);
        System.out.println("La media de pasos que has realizado son: " + promedio);
    }

    public static List<Integer> filtrarPasos(String[] pasos) {
        return Arrays.stream(pasos)
                .map(Integer::parseInt)
                .filter(paso -> paso >= 200 && paso <= 100000)
                .collect(Collectors.toList());
    }

    public static double calcularPromedio(List<Integer> pasos) {
        return pasos.stream().mapToInt(Integer::intValue).average().orElse(0);
    }
}
