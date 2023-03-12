import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        int orden = Integer.parseInt(args[i]);
        ordenamientoVectorPorParametros(orden, args);
    }

    public static void ordenamientoVectorPorParametros(int orden, String[] args) {
        Integer[] vector = new Integer[args.length - 1];

        for(int i = 0; i < args.length - 1; ++i) {
            vector[i] = Integer.parseInt(args[i + 1]);
        }

        if (orden == 0) {
            Arrays.sort(vector);
            System.out.println(Arrays.toString(vector));
        } else if (orden == 1) {
            Arrays.sort(vector, Collections.reverseOrder());
            System.out.println(Arrays.toString(vector));
        }

    }
}