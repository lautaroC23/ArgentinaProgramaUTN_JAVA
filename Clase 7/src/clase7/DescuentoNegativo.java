package clase7;

public class DescuentoNegativo extends Exception{
    public DescuentoNegativo(){
        super("El descuento dio como resultado un monto a pagar negativo");
    }
}
