import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        String operacion = args[1];
        int num;
        int suma = 0;
        int multiplicacion = 1;
        String archivo = args[0];

        if(operacion.equals("SUMA")){
            for (String linea : Files.readAllLines(Paths.get(archivo))){
                for(int i = 0; i < linea.split(" ").length; i++) {
                    num = Integer.parseInt(linea.split(" ")[i]);
                    suma += num;
                }
            }
            System.out.println("La suma es: " + suma);
        }
        else if(operacion.equals("MULTIPLICACION")){
                for (String linea : Files.readAllLines(Paths.get(archivo))){
                    for(int i = 0; i < linea.split(" ").length; i++) {
                        num = Integer.parseInt(linea.split(" ")[i]);
                        multiplicacion *= num;
                    }
                }
                System.out.println("La Multiplicacion es: " + multiplicacion);
            }
    }
}
