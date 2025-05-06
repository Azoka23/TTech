package ejercicioClase7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto te1 = new Te("Té Verde", 150, 10);
        Producto cafe1 = new Cafe("Café Expreso", 200, 5);
        Producto accesorio1 = new Accesorio("Taza Cerámica", 100, 20);

        // Mostrar contador de productos
        System.out.println("Total de productos creados: " + Producto.getContadorProductos());

        // Crear un cliente
        Cliente cliente1 = new Cliente("Sofía", "sofia@gmail.com");

        // Mostrar info del cliente
        cliente1.mostrarInformacion();

        // Crear carrito y agregar productos
        Carrito carrito = new Carrito();
        carrito.agregarProducto(te1);
        carrito.agregarProducto(cafe1);
        carrito.agregarProducto(accesorio1);

        // Mostrar productos y total
        carrito.mostrarProductos();
        System.out.println("Total del carrito: $" + carrito.calcularTotal());

        // Aplicar descuentos usando interfaz (si está implementada)
        if (te1 instanceof Descontable) {
            ((Descontable) te1).aplicarDescuento(10);
            System.out.println("Nuevo precio final del té: $" + te1.calcularPrecioFinal());
        }

        // Demostración de polimorfismo con ArrayList<Producto>
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(te1);
        productos.add(cafe1);
        productos.add(accesorio1);

        System.out.println("\n--- Polimorfismo en acción ---");
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - Precio final: $" + p.calcularPrecioFinal());
        }
    }
}
