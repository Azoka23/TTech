package ejercicioClase8.com.techlab.productos;

public class Accesorio extends Producto {

    public Accesorio(String nombre, double precio, int cantidadEnStock) {
        super(nombre, precio, cantidadEnStock);  // Llama al constructor de Producto
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio();  // Usa el precio de Producto
    }
}
