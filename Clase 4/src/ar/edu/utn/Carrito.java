package ar.edu.utn;

import java.time.LocalDateTime;
public class Carrito {

    private Persona persona;

    private Producto[] productos = new Producto[3];

    private LocalDateTime fechaCompra;

    public Carrito(){
    }

    public Persona getPersona(){
        return this.persona;
    }
    public void setPersona(Persona nuevaPersona){
        this.persona = nuevaPersona;
    }

    public void setProductos(Producto nuevoProducto, int numProducto){
        this.productos[numProducto-1] = nuevoProducto;
    }

    public float costoFinal(){
        float costo = 0;
        for(int i = 0; i < this.productos.length; i++){
            costo += this.productos[i].preciofinal(1);
        }
        return costo;
    }
}
