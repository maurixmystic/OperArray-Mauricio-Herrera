public class MultiplosDeTres {
    public static void main(String[] args) {
        int[] array = convertirAEnteros(args);
        int suma = sumarMultiplosDeTres(array);
        System.out.println("La suma es: " + suma);
        double media = calcularMedia(array);
        System.out.println("El promedio es: " + media);
    }

    public static int[] convertirAEnteros(String[] argumentos) {
        int[] array = new int[argumentos.length];
        for (int i = 0; i < argumentos.length; i++) {
            array[i] = Integer.parseInt(argumentos[i]);
        }
        return array;
    }

    public static int sumarMultiplosDeTres(int[] array) {
        int total = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                total += num;
            }
        }
        return total;
    }

    public static double calcularMedia(int[] array) {
        int total = 0;
        int contador = 0;
        for (int num : array) {
            if (num % 3 == 0) {
                contador++;
                total += num;
            }
        }
        if (contador == 0) {
            return 0.0;
        }
        return (double) total / contador;
    }
}
