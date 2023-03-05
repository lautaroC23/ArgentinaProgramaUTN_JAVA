public class Main {
    public static void main(String[] args) {

        int numeroInicio = 4;
        int numeroFin = 21;
        int numero = numeroInicio;

        //ejercicio a
        while (numero >= numeroInicio && numero <= numeroFin) {
            System.out.println(numero);
            numero++;
        }

        //ejercicio b
        int numeroB = numeroInicio;
        while(numeroB >= numeroInicio && numeroB <= numeroFin){
            if(numeroB % 2 == 0)
                System.out.println(numeroB);

            numeroB++;
        }

        //ejercicio c
        int numeroC = numeroInicio;
        char par_o_impar = 'i'; //p para par, i para impar.

        if (par_o_impar == 'p') {
            while (numeroC >= numeroInicio && numeroC <= numeroFin) {
                if (numeroC % 2 == 0)
                    System.out.println(numeroC);
                numeroC++;
            }
        }
        else
            if(par_o_impar == 'i') {
                while (numeroC >= numeroInicio && numeroC <= numeroFin) {
                    if (numeroC % 2 != 0)
                        System.out.println(numeroC);
                    numeroC++;
                }
            }

        //ejercicio d
        for (numeroB = numeroFin; numeroB>=numeroInicio; numeroB--){
            if(numeroB % 2 == 0)
                System.out.println(numeroB);
        }

        ///////////////////////////////////////////////////////////////////////////

        //PUNTO 2

        float ingresos = 500000;
        int cant_vehi = 2, antiguedad = 3, inmuebles = 2;
        char embarcacion = 'S', aeronave = 'N', activos = 'N'; //S posee, N no posee

        if(ingresos >= 489083 || (cant_vehi >= 3 && antiguedad < 5) || inmuebles >= 3 || embarcacion == 'S' || aeronave == 'S' || activos == 'S')
            System.out.println("Pertenece al segmento de ingresos altos");
        else
            System.out.println("No pertenece a ingresos altos");

    }
}