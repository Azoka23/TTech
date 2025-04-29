
package miempresa.ecommerce;

import java.util.*;

public class Compra {
    private List<Producto> productosComprados;
    private double totalCompra;

    public Compra() {
        this.productosComprados = new ArrayList<>();
        this.totalCompra = 0;
    }

    public void agregarProducto(Producto producto, int cantidad, Scanner scanner) {
        if (producto.getStock() >= cantidad) {
            producto.reducirStock(cantidad);
            productosComprados.add(new Producto(producto.getNombre(), producto.getPrecio(), cantidad));
            totalCompra += cantidad * producto.getPrecio();
            System.out.println("Producto agregado al carrito.");
        } else {
            System.out.println("Stock insuficiente. Solo disponemos de " + producto.getStock() + " unidades.");
            System.out.print("¿Desea comprar la cantidad disponible? (s/n): ");
            String respuesta = scanner.nextLine().toLowerCase();

            if (respuesta.equals("s")) {
                int stockDisponible = producto.getStock();
                if (stockDisponible > 0) {
                    producto.reducirStock(stockDisponible);
                    productosComprados.add(new Producto(producto.getNombre(), producto.getPrecio(), stockDisponible));
                    totalCompra += stockDisponible * producto.getPrecio();
                    System.out.println("Producto agregado al carrito.");
                } else {
                    System.out.println("Lo sentimos, el producto está agotado.");
                }
            }
        }
    }

    public void generarTicket(Scanner scanner) {
        System.out.println("\n********** TICKET DE COMPRA **********");
        System.out.println("\n--- Carrito de Compras ---");
        for (Producto p : productosComprados) {
            System.out.println(p.getNombre() + " x" + p.getStock() + " - $" + (p.getStock() * p.getPrecio()));
        }
        System.out.println("Total: $" + totalCompra);

        if (totalCompra > 10000) { // Umbral para aplicar descuento
            System.out.print("\n¿Desea aplicar un 10% de descuento? (s/n): ");
            if (scanner.nextLine().equalsIgnoreCase("s")) {
                double descuento = totalCompra * 0.10;
                totalCompra -= descuento;
                System.out.println("Descuento aplicado: -$" + descuento);
                System.out.println("Total con descuento: $" + totalCompra);
            }
        }
        System.out.println("**************************************");
    }
}
