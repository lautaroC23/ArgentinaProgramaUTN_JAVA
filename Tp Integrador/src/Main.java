import integrador.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IOException {

        String archivoPronostico = args[0];
        String archivoResultados = args[1];

        Persona unaPersona = new Persona();
        unaPersona.setNombre("Lautaro");
        unaPersona.setApellido("Conchiglia");
        unaPersona.setFechaNacimiento(LocalDateTime.parse("2002-04-23T01:00:00"));
        //int edad = unaPersona.calcularEdad();

        int i = 0;
        int cantLineas1 = 0;
        int puntaje = 0;
        Partido unPartido = new Partido();
        Equipo equip1 = new Equipo();
        Equipo equip2 = new Equipo();
        ResultadoEnum resultado = new ResultadoEnum();
        Pronostico pronostico1 = new Pronostico();
        Ronda ronda1 = new Ronda();

        for(String linea : Files.readAllLines(Paths.get(archivoPronostico))){
            cantLineas1++;
        }


        String[] lineaVector = new String[cantLineas1];
        for(String linea : Files.readAllLines(Paths.get(archivoPronostico))){
            lineaVector[i] = linea;
            i++;
        }

        for(i = 0; i < lineaVector.length; i++) {
            String[] lineaNueva = lineaVector[i].split(";");
            for (int j = 0; j < lineaNueva.length; j++) {

                if(j == 0) {
                    equip1.setNombre(lineaNueva[j]);
                }

                if (j == 1)
                    if (lineaNueva[j].equals("X"))
                        resultado.setresultado(resultado.ganaEquipo1());

                if (j == 2)
                    if (lineaNueva[j].equals("X"))
                        resultado.setresultado(resultado.empate());

                if (j == 3)
                    if (lineaNueva[j].equals("X"))
                        resultado.setresultado(resultado.ganaEquipo2());

                if (j == 4)
                    equip2.setNombre(lineaNueva[j]);
            }
            pronostico1.setresultado(resultado);

            int cantLineas2 = 0;
            for(String linea : Files.readAllLines(Paths.get(archivoResultados))){
                cantLineas2++;
            }

            int indice = 0;
            String[] lineaVector2 = new String[cantLineas2];
            for(String linea1 : Files.readAllLines(Paths.get(archivoResultados))){
                lineaVector2[indice] = linea1;
                indice++;
            }

            if (i < lineaVector2.length) {
                String[] lineaNueva1 = lineaVector2[i].split(";");
                for(int j = 0; j < lineaNueva1.length; j++){

                    if(j == 1)
                        unPartido.setGolesEquipo1(Integer.parseInt(lineaNueva1[j]));

                    if(j == 2)
                        unPartido.setGolesEquipo2(Integer.parseInt(lineaNueva1[j]));
                }
            }
            unPartido.setEquipo1(equip1);
            unPartido.setEquipo2(equip2);
            puntaje += ronda1.puntos(pronostico1, unPartido);
        }

        System.out.println("El puntaje de " + unaPersona.getNombre() + " es de: " + puntaje);
    }
}
