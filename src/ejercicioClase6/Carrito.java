package ejercicioClase6;



import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void mostrarProductos() {
        for (Producto p : productos) {
            System.out.println("- " + p.getNombre() + ": $" + p.getPrecio());
        }
    }
}

