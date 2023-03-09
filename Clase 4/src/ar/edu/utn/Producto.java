package ar.edu.utn;

import java.time.LocalDate;
public class Producto {

    private String nombre;
    private String codigo;
    private float precio;

    public Producto(){
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void setCodigo(String nuevoCodigo) {
        this.codigo = nuevoCodigo;
    }

    public void setPrecio(float nuevoPrecio){
        this.precio = nuevoPrecio;
    }

    public float preciofinal(int cantCuotas) {
        if(cantCuotas > 3)
            return this.precio += (this.precio * 0.20);
        else
            return this.precio;
    }
}
