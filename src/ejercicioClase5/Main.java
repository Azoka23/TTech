package ejercicioClase5;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto p1 = new Producto();
        p1.nombre = "Café en grano";
        p1.precio = 1500;
        p1.stock = 40;

        p1.mostrarInformacion();
        System.out.println("Precio con 10% de descuento: $" + p1.calcularPrecioConDescuento());

        // Crear clientes
        Cliente c1 = new Cliente("Sabrina", "sabrina@email.com");
        Cliente c2 = new Cliente("Matías", "matias@email.com");

        c1.mostrar();
        c2.mostrar();
    }
}

