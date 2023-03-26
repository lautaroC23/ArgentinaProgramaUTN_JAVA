package clase7;
public class CarritoConPrecioCero extends Exception{
    public CarritoConPrecioCero(){
        super("No se puede aplicar descuentos a carrito con importe 0");
    }
}
