public class Main {
    public static void main(String[] args) {

        //Ejercicio 1a
        String cadena = "programacion";
        char letra = 'a';
        int contador = 0;

        for(int i = 0; i < cadena.length(); i++)
            if(cadena.charAt(i) == letra)
                contador++;
        System.out.println("Cantidad de letras \"a\":\t");
        System.out.println(contador);

        //ejercicio 1 b.
        int num1 = 18, num2 = 3, num3 = 10, aux, i = 0;
        int [] vector = new int[]{num1,num2,num3};
        char orden = 'A';

        if(orden == 'A'){
            while(i < (vector.length-1)) {
                if (vector[i] > vector[i + 1]) {
                    aux = vector[i + 1];
                    vector[i + 1] = vector[i];
                    vector[i] = aux;
                }
                i++;
            }
        }
        else{
            if(orden =='D'){
                while(i < (vector.length-1)) {
                    if (vector[i] < vector[i + 1]) {
                        aux = vector[i + 1];
                        vector[i + 1] = vector[i];
                        vector[i] = aux;
                    }
                    i++;
                }
            }
        }
        System.out.println("Vector Ordenado");
        for(int numeros : vector)
            System.out.println(numeros);

        //ejercicio 1 c.
        int X = 4, suma=0;
        int [] vectornumeros = new int[]{2, 9, 20, 2, 0, 4};

        for(int valor : vectornumeros)
            if(valor > X)
                suma += valor;

        System.out.println("Suma");
        System.out.println(suma);

        //Ejercicio 2
        int indice = 0, principio=0;
        String abecedario = "abcdefghijklmnopqrstuvwxyz";
        String abecedarioNuevo = "";
        char [] abecedarioVector = new char[abecedario.length()];

        while(indice < abecedario.length()){
            if(indice >= abecedario.length()-2){
                abecedarioVector[indice] = abecedario.charAt(principio);
                abecedarioNuevo += abecedarioVector[indice];
                principio++;
            }
            else {
                int valorASCII = abecedario.charAt(indice);
                char nuevaLetra = (char) (valorASCII + 2);
                abecedarioVector[indice] = nuevaLetra;
                abecedarioNuevo += abecedarioVector[indice];
            }
            indice++;
        }
        System.out.println("String desplazado");
        System.out.println(abecedarioNuevo);
    }
}