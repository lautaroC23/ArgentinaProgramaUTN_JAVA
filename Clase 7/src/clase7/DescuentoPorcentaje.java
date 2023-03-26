package clase7;

public class DescuentoPorcentaje extends Descuento {
    public float valorFinal(float valorInicial) throws DescuentoNegativo {
        if((valorInicial - (valorInicial * this.getValorDesc())) < 0){
            throw new DescuentoNegativo();
        }
        return valorInicial - (valorInicial * this.getValorDesc());
    }
}
