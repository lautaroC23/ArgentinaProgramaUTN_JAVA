package ar.edu.utn;

public class DescuentoPorcentaje extends Descuento {
    public float valorFinal(float valorInicial){
        return valorInicial - (valorInicial * this.getValorDesc());
    }
}
