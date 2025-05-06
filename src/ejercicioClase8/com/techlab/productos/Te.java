package ejercicioClase8.com.techlab.productos;

public class Te extends Producto {
    public Te(String nombre, double precio, int cantidadEnStock) {
        super(nombre, precio, cantidadEnStock);
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio(); // Usa el precio de Producto
    }

    //@Override
    public void aplicarDescuento(double porcentaje) {
        double nuevoPrecio = getPrecio() - (getPrecio() * porcentaje / 100);
        setPrecio(nuevoPrecio);  // Actualiza el precio con el descuento
    }
}
