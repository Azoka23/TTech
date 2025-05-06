package ejercicioClase8.com.techlab.productos;

public class Cafe extends Producto {

    public Cafe(String nombre, double precio, int cantidadEnStock) {
        super(nombre, precio, cantidadEnStock); // Llama al constructor de Producto
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.21;  // Aplica un IVA del 21%
    }
}
