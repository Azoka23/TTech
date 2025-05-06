package ejercicioClase7;


public class Cafe extends Producto implements Descontable {

    public Cafe(String nombre, double precio, int cantidadEnStock) {
        super(nombre, precio, cantidadEnStock); // Llama al constructor de Producto
    }

    @Override
    public double calcularPrecioFinal() {
        return getPrecio() * 1.21; // Le agregamos 21% de IVA como ejemplo
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double nuevoPrecio = getPrecio() - (getPrecio() * porcentaje / 100);
            setPrecio(nuevoPrecio);
        }
    }

    // Podés sobrescribir otro método si querés:
    @Override
    public void mostrarInformacion() {
        System.out.println("Café: " + getNombre() + " - Precio: $" + getPrecio() + " - Stock: " + getCantidadEnStock());
        super.mostrarInformacion(); // Reutiliza parte de la lógica de Producto
    }
}
