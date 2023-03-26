package clase7;

public class Producto {

    private String nombre;
    private String codigo;
    private float precio;

    public Producto(){
    }
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }

    public void setCodigo(String nuevoCodigo) {
        this.codigo = nuevoCodigo;
    }

    public float getPrecio(){
        return this.precio;
    }
    public void setPrecio(float nuevoPrecio){
        this.precio = nuevoPrecio;
    }
}
