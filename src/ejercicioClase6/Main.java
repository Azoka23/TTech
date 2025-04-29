package ejercicioClase6;



public class Main {
    public static void main(String[] args) {

        // Clientes
        Cliente c1 = new Cliente("Matías", "matias@email.com");
        Cliente c2 = new Cliente("Sabrina", "sabrina.com"); // inválido

        // Productos
        Producto p1 = new Producto("Café", 1200, 50);
        Producto p2 = new Producto("Té", 800, 30);
        Producto p3 = new Producto("Yerba", 900, -10); // inválido

        System.out.println("\nTotal de productos creados: " + Producto.getContadorProductos());

        // Carrito
        Carrito carrito = new Carrito();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);

        System.out.println("\nProductos en el carrito:");
        carrito.mostrarProductos();

        System.out.println("Total del carrito: $" + carrito.calcularTotal());
    }
}
