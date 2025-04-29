package ejercicioClase5;



public class Producto {
    String nombre;
    double precio;
    int stock;

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }

    public double calcularPrecioConDescuento() {
        return precio * 0.90; // 10% de descuento
    }
}

