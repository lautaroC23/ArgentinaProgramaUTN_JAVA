package clase7;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private Persona persona;

    private List<Producto> lista;

    public Carrito(){
        this.lista = new ArrayList<>();
    }
    public Persona getPersona(){
        return this.persona;
    }
    public void setPersona(Persona pers){
        this.persona = pers;
    }
    public float costoFinal() throws CarritoConPrecioCero {
        float precioFinal = 0;
        for(Producto prod : this.lista){
            float precioProd = prod.getPrecio();
            precioFinal += precioProd ;
        }
        if(precioFinal == 0){
            throw new CarritoConPrecioCero();
        }
        return precioFinal;
    }
    public void agregarProducto(Producto prod){
        this.lista.add(prod);
    }
}
