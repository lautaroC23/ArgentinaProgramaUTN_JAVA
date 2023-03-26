import clase7.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CarritoConPrecioCero, DescuentoNegativo {
        Scanner scn = new Scanner(System.in);

        Persona persona1 = new Persona();
        persona1.setNombre("Ivan");

        Carrito unCarrito = new Carrito();
        unCarrito.setPersona(persona1);

        Producto producto1 = new Producto();
        producto1.setNombre("Coca Cola");
        producto1.setCodigo("1");
        producto1.setPrecio(100);
        unCarrito.agregarProducto(producto1);

        Producto producto2 = new Producto();
        producto2.setNombre("Esponjas");
        producto2.setCodigo("G2");
        producto2.setPrecio(50);
        unCarrito.agregarProducto(producto2);

        Producto producto3 = new Producto();
        producto3.setNombre("Chocolates");
        producto3.setCodigo("L43");
        producto3.setPrecio(20);
        unCarrito.agregarProducto(producto3);

        try{
            unCarrito.costoFinal();
        }catch (CarritoConPrecioCero exc1){
            System.out.println(exc1.getMessage());
        }
        if(unCarrito.costoFinal() > 0){
            switch (args[0]) {
                case "FIJO" -> {
                    Descuento desc = new DescuentoFijo();
                    System.out.println("Ingrese un descuento fijo: ");
                    desc.setValorDesc(Integer.parseInt(scn.nextLine()));
                    try {
                        System.out.println("Precio Final de la compra de " + unCarrito.getPersona().getNombre() + ": $ "
                                + desc.valorFinal(unCarrito.costoFinal()));
                    }catch (DescuentoNegativo exc2){
                        System.out.println(exc2.getMessage());
                    }
                }
                case "PORCENTAJE" -> {
                    Descuento desc = new DescuentoPorcentaje();
                    System.out.println("Ingrese un descuento en porcentaje (Ejemplo: 0.3 = 30%): ");
                    desc.setValorDesc(Float.parseFloat(scn.nextLine()));
                    try {
                        System.out.println("Precio Final de la compra de " + unCarrito.getPersona().getNombre() + ": $ "
                                + desc.valorFinal(unCarrito.costoFinal()));
                    }catch (DescuentoNegativo exc2){
                        System.out.println(exc2.getMessage());
                    }
                }
                case "TOPE" -> {
                    Descuento desc = new DescuentoPorcentajeConTope();
                    desc.setValorTope(70);
                    System.out.println("Ingrese un descuento en porcentaje (Ejemplo: 0.3 = 30%): ");
                    desc.setValorDesc(Float.parseFloat(scn.nextLine()));
                    try {
                        System.out.println("Precio Final de la compra de " + unCarrito.getPersona().getNombre() + ": $ "
                                + desc.valorFinal(unCarrito.costoFinal()));
                    }catch (DescuentoNegativo exc2){
                        System.out.println(exc2.getMessage());
                    }
                }
                default -> {}
            }
        }
    }
}
