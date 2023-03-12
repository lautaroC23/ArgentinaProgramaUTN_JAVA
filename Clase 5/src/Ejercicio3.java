import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

 class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        int proceso = Integer.parseInt(args[0]); //0 para codificacion y 1 para decodificacion
        int desplazamiento = Integer.parseInt(args[1]);
        String archivoEntrada = args[2];
        String archivoSalida = args[3];


        if(proceso == 0)
            cifradoCesarConArchivos(desplazamiento, archivoEntrada, archivoSalida);
        else if(proceso == 1)
                descifradoCesarConArchivos(desplazamiento, archivoEntrada, archivoSalida);
    }

    public static void cifradoCesarConArchivos(int desplazamiento, String archivoEntrada, String archivoSalida) throws IOException {
        int indice = 0, principio = 0;
        String cifrado = "";
        for (String linea : Files.readAllLines(Paths.get(archivoEntrada))){
            char [] cifradoVector = new char[linea.length()];

            while(indice < linea.length()){
                if(indice >= linea.length()-desplazamiento){
                    cifradoVector[indice] = linea.charAt(principio);
                    cifrado += cifradoVector[indice];
                    principio++;
                }
                else {
                    cifradoVector[indice] = linea.charAt(indice+desplazamiento);
                    cifrado += cifradoVector[indice];
                }
                indice++;
            }
        }
        Files.writeString(Paths.get(archivoSalida), cifrado);
    }

    public static void descifradoCesarConArchivos(int desplazamiento, String archivoEntrada, String archivoSalida)
            throws IOException {
        String cifrado = "";
        for (String linea : Files.readAllLines(Paths.get(archivoEntrada))){
            int indice = 0;
            char [] cifradoVector = new char[linea.length()];
            int fin = linea.length() - desplazamiento;

            while(indice < linea.length()){
                if(indice < desplazamiento){
                    cifradoVector[indice] = linea.charAt(fin);
                    cifrado += cifradoVector[indice];
                    fin++;
                }
                else {
                    cifradoVector[indice] = linea.charAt(indice - desplazamiento);
                    cifrado += cifradoVector[indice];
                }
                indice++;
            }
        }
        Files.writeString(Paths.get(archivoSalida), cifrado);
     }
}
