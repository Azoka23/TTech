package ejercicioClase6;


public class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Contador estático
    private static int contadorProductos = 0;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        setCantidadEnStock(cantidadEnStock);
        contadorProductos++;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock >= 0) {
            this.cantidadEnStock = cantidadEnStock;
        } else {
            System.out.println("Stock inválido: no puede ser negativo");
        }
    }
}

