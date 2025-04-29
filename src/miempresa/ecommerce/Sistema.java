package miempresa.ecommerce;

import java.util.*;

public class Sistema {
    private List<Cliente> clientes;
    private Map<String, List<Producto>> productosPorCategoria;

    public Sistema() {
        this.clientes = new ArrayList<>();
        this.productosPorCategoria = new HashMap<>();
        cargarProductos();
    }

    private void cargarProductos() {
        agregarProductoACategoria("Cuadernos", new Producto("Cuaderno rayado", 1200.0, 15));
        agregarProductoACategoria("Cuadernos", new Producto("Cuaderno cuadriculado", 1300.0, 10));
        agregarProductoACategoria("Lapiceras", new Producto("Lapicera negra", 550.0, 10));
        agregarProductoACategoria("Lapiceras", new Producto("Lapicera azul", 550.0, 8));
        agregarProductoACategoria("Carpetas", new Producto("Carpeta con anillos", 2500.0, 5));
    }

    private void agregarProductoACategoria(String categoria, Producto producto) {
        productosPorCategoria.computeIfAbsent(categoria, k -> new ArrayList<>()).add(producto);
    }

    public Cliente obtenerCliente(String dni) {
        for (Cliente c : clientes) {
            if (c.getDni().equals(dni)) {
                return c;
            }
        }
        return null;
    }

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void realizarCompra(Cliente cliente, Scanner scanner) {
        Compra compra = new Compra();
        boolean seguirComprando = true;

        while (seguirComprando) {
            System.out.println("\nCategorías disponibles:");
            List<String> categorias = new ArrayList<>(productosPorCategoria.keySet());
            for (int i = 0; i < categorias.size(); i++) {
                System.out.println((i + 1) + ". " + categorias.get(i));
            }

            System.out.print("Seleccione una categoría (número): ");
            int categoriaSeleccionada = Integer.parseInt(scanner.nextLine()) - 1;

            if (categoriaSeleccionada >= 0 && categoriaSeleccionada < categorias.size()) {
                String categoria = categorias.get(categoriaSeleccionada);
                List<Producto> productos = productosPorCategoria.get(categoria);

                System.out.println("\nProductos en la categoría " + categoria + ":");
                for (int i = 0; i < productos.size(); i++) {
                    Producto p = productos.get(i);
                    System.out.println((i + 1) + ". " + p.getNombre() + " - $" + p.getPrecio() + " (Stock: " + p.getStock() + ")");
                }

                System.out.print("Seleccione un producto (número): ");
                int productoSeleccionado = Integer.parseInt(scanner.nextLine()) - 1;

                if (productoSeleccionado >= 0 && productoSeleccionado < productos.size()) {
                    Producto producto = productos.get(productoSeleccionado);
                    System.out.print("Ingrese la cantidad: ");
                    int cantidad = Integer.parseInt(scanner.nextLine());
                    compra.agregarProducto(producto, cantidad, scanner);
                } else {
                    System.out.println("Opción de producto inválida.");
                }
            } else {
                System.out.println("Opción de categoría inválida.");
            }

            System.out.print("¿Desea comprar otro producto? (s/n): ");
            seguirComprando = scanner.nextLine().equalsIgnoreCase("s");
        }

        compra.generarTicket(scanner);
    }
}
