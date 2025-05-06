package ejercicioClase7;

public abstract class Producto {
    private String nombre;
    private double precio;
    private int cantidadEnStock;
    private static int contadorProductos = 0;

    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        this.precio = precio;
        setCantidadEnStock(cantidadEnStock);
        contadorProductos++;
    }

    public String getNombre() {
        return nombre;
    }

    //public double getPrecio() {
       // return precio;
    // }

    // En Producto.java
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }




    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock >= 0) {
            this.cantidadEnStock = cantidadEnStock;
        } else {
            System.out.println("No se puede asignar stock negativo.");
        }
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public abstract double calcularPrecioFinal();

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio base: $" + precio);
        System.out.println("Stock: " + cantidadEnStock);
    }
}


