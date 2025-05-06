package ejercicioClase8.com.techlab.pedidos;

import ejercicioClase7.Producto;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.calcularPrecioFinal(); // polimorfismo en acción
        }
        return total;
    }

    public void mostrarProductos() {
        System.out.println("Productos en el carrito:");
        for (Producto p : productos) {
            p.mostrarInformacion();
            System.out.println("Precio final: $" + p.calcularPrecioFinal());
            System.out.println("------");
        }
    }
}
