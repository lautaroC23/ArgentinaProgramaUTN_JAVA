import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class Ejercicio1c {
    public static void main(String[] args) {

        int orden;

        if (args.length == 0) {
            Scanner scn = new Scanner(System.in);
            System.out.println("Ingrese 0 para orden ascendente o 1 para descendente: ");

            orden = Integer.parseInt(scn.nextLine());

            System.out.println("Ingrese tres valores numericos separados por un espacio: ");
            String numeros = scn.nextLine();

            int i = 0;
            Integer[] vector = new Integer[numeros.split(" ").length];
            for (String numerosStr : numeros.split(" ")) {
                vector[i] = Integer.parseInt(numerosStr);
                i++;
            }
            ordenamientoVectorPorConsola(orden, vector);
        }
        else{
            int i = 0;
            orden = Integer.parseInt(args[i]);
            ordenamientoVectorPorParametros(orden, args);
        }
    }
    public static void ordenamientoVectorPorConsola(int orden, Integer[] vector){
        if(orden == 0){
            Arrays.sort(vector);
            System.out.println(Arrays.toString(vector));
        }
        else if(orden == 1){
            Arrays.sort(vector, Collections.reverseOrder());
            System.out.println(Arrays.toString(vector));
        }
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