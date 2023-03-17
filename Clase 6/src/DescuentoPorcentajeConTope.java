public class DescuentoPorcentajeConTope extends Descuento {
    public DescuentoPorcentajeConTope(){}
    public float valorFinal(float valorInicial){
        if(valorInicial * getValorDesc() > getValorTope())
            return valorInicial - getValorTope();
        else
            return valorInicial - (valorInicial * getValorDesc());
    }
}
