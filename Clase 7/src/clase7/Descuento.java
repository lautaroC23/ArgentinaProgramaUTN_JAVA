package clase7;

public abstract class Descuento {
    private float valorDesc;
    private float valorTope;

    public float getValorDesc(){
        return valorDesc;
    }

    public void setValorDesc(float valor){
        this.valorDesc = valor;
    }

    public float getValorTope(){
        return this.valorTope;
    }
    public void setValorTope(float valor){
        this.valorTope = valor;
    }

    public abstract float valorFinal(float valorInicial) throws DescuentoNegativo;
}
