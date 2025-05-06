package ejercicioClase8.com.techlab.ui;

import ejercicioClase8.com.techlab.productos.*;
import ejercicioClase8.com.techlab.excepciones.ProductoNoEncontradoException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Lista de productos
        List<Producto> productos = new ArrayList<>();
        productos.add(new Te("Té Verde", 150, 10));
        productos.add(new Cafe("Café Expreso", 200, 5));
        productos.add(new Accesorio("Taza Cerámica", 100, 20));

        // Crear el servicio de productos
        ProductoService servicio = new ProductoService(productos);

        // Buscar un producto que existe
        try {
            Producto p = servicio.buscarProductoPorNombre("Té Verde");
            System.out.println("Producto encontrado: ");
            p.mostrarInformacion();  // Muestra toda la información del producto
        } catch (ProductoNoEncontradoException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }

        // Buscar un producto que no existe
        try {
            Producto p = servicio.buscarProductoPorNombre("Té Negro");
            System.out.println("Producto encontrado: ");
            p.mostrarInformacion();  // No se ejecuta, se lanza la excepción
        } catch (ProductoNoEncontradoException e) {
            System.out.println("⚠️ Error: " + e.getMessage());  // Aquí muestra el error
        }

        // Probar el cálculo de precio final para productos con descuento
        System.out.println("\nAplicando descuento al Té Verde:");
        Te teVerde = (Te) productos.get(0);  // Accedemos al Té Verde
        teVerde.aplicarDescuento(10);  // Aplicamos un 10% de descuento
        teVerde.mostrarInformacion();  // Mostramos la nueva información con descuento

        // Probar el cálculo de precio final para un Café
        System.out.println("\nPrecio final del Café Expreso con IVA:");
        Cafe cafe = (Cafe) productos.get(1);  // Accedemos al Café Expreso
        cafe.mostrarInformacion();  // Mostramos la información del Café
        System.out.println("Precio con IVA: $" + cafe.calcularPrecioFinal());  // Calculamos el precio final

        // Probar el accesorio
        System.out.println("\nPrecio del accesorio:");
        Accesorio accesorio = (Accesorio) productos.get(2);  // Accedemos al accesorio
        accesorio.mostrarInformacion();  // Mostramos la información del accesorio
    }
}
