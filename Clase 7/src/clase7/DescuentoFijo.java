package clase7;

public class DescuentoFijo extends Descuento {
    public float valorFinal(float valorInicial){
        return valorInicial - this.getValorDesc();
    }
}
