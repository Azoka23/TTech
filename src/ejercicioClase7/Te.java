package ejercicioClase7;

public class Te extends Producto implements Descontable {
    private double precio;

    public Te(String nombre, double precio, int cantidadEnStock) {
        super(nombre, precio, cantidadEnStock);
        this.precio = precio;
    }

    @Override
    public double calcularPrecioFinal() {
        return precio;
    }

    @Override
    public void aplicarDescuento(double porcentaje) {
        precio -= precio * (porcentaje / 100);
    }
}
