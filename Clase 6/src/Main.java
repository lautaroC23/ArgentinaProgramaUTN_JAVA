import ar.edu.utn.*;

import java.util.Scanner;
public class Main { //parametros desde argumentos a main

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

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

        switch (args[0]) {
            case "FIJO" -> {
                Descuento desc = new DescuentoFijo();
                System.out.println("Ingrese un descuento fijo: ");
                desc.setValorDesc(Integer.parseInt(scn.nextLine()));
                System.out.println("Precio Final de la compra de " + nuevoCarrito.getPersona().getNombre() + ": $ "
                        + desc.valorFinal(nuevoCarrito.costoFinal()));
            }
            case "PORCENTAJE" -> {
                Descuento desc = new DescuentoPorcentaje();
                System.out.println("Ingrese un descuento en porcentaje (Ejemplo: 0.3 = 30%): ");
                desc.setValorDesc(Float.parseFloat(scn.nextLine()));
                System.out.println("Precio Final de la compra de " + nuevoCarrito.getPersona().getNombre() + ": $ "
                        + desc.valorFinal(nuevoCarrito.costoFinal()));
            }
            case "TOPE" -> {
                Descuento desc = new DescuentoPorcentajeConTope();
                desc.setValorTope(70);
                System.out.println("Ingrese un descuento en porcentaje (Ejemplo: 0.3 = 30%): ");
                desc.setValorDesc(Float.parseFloat(scn.nextLine()));
                System.out.println("Precio Final de la compra de " + nuevoCarrito.getPersona().getNombre() + ": $ "
                        + desc.valorFinal(nuevoCarrito.costoFinal()));
            }
            default -> {
            }
        }
    }
}
