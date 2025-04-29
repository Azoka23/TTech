package miempresa.ecommerce;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    // Constructor vacío
    public Producto() {}

    // Constructor con parámetros
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    // Método para verificar si hay stock suficiente
    public boolean hayStock(int cantidad) {
        return cantidad <= stock;
    }

    // Método para reducir el stock después de una compra
    public void reducirStock(int cantidad) {
        if (hayStock(cantidad)) {
            stock -= cantidad;
        }
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio + " (Stock: " + stock + ")";
    }
}

