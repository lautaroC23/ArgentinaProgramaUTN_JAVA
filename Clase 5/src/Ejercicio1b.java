import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio1b {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese 0 para orden ascendente o 1 para descendente: ");

        int orden = Integer.parseInt(scn.nextLine());

        System.out.println("Ingrese tres valores numericos separados por un espacio: ");
        String numeros = scn.nextLine();

        int i = 0;
        Integer[] vector = new Integer[numeros.split(" ").length];
        for(String numerosStr : numeros.split(" ")){
            vector[i] = Integer.parseInt(numerosStr);
            i++;
        }
        ordenamientoVectorPorConsola(orden, vector);
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
}
