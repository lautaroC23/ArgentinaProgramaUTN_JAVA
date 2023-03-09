import ar.edu.utn.Carrito;
import ar.edu.utn.Persona;
import ar.edu.utn.Producto;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        /*Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Lautaro");
        nuevaPersona.setApellido("Conchiglia");
        nuevaPersona.setFechaNacimiento(LocalDateTime.parse("2002-04-23T01:00:00"));

        System.out.println("La edad de la persona es: " + nuevaPersona.calcularEdad());

        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre("Fernet");
        nuevoProducto.setCodigo("43B");
        nuevoProducto.setPrecio(1800);

        System.out.println("El precio en 4 cuotas de " + nuevoProducto.getNombre() + "es: " + nuevoProducto.preciofinal(4));

        *///Ejercicio 2

        Persona persona1 = new Persona();
        persona1.setNombre("Ivan");

        Producto producto1 = new Producto();
        producto1.setNombre("Jabon En Polvo");
        producto1.setCodigo("Q12");
        producto1.setPrecio(40);

        Producto producto2 = new Producto();
        producto2.setNombre("Esponjas");
        producto2.setCodigo("G2");
        producto2.setPrecio(10);

        Producto producto3 = new Producto();
        producto3.setNombre("Chocolates");
        producto3.setCodigo("L43");
        producto3.setPrecio(100);

        Carrito nuevoCarrito = new Carrito();
        nuevoCarrito.setPersona(persona1);
        nuevoCarrito.setProductos(producto1, 1);
        nuevoCarrito.setProductos(producto2, 2);
        nuevoCarrito.setProductos(producto3, 3);

        System.out.println("Precio Final de la compra de " + nuevoCarrito.getPersona().getNombre() + ": $ " + nuevoCarrito.costoFinal());
    }
}