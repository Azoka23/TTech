
package miempresa.ecommerce;

import java.util.*;

public class Catalogo {
    private Map<String, List<Producto>> categorias;

    public Catalogo() {
        categorias = new HashMap<>();

        // 📚 Categoría: Cuadernos
        List<Producto> cuadernos = new ArrayList<>();
        cuadernos.add(new Producto("Cuaderno Rayado", 1000, 10));
        cuadernos.add(new Producto("Cuaderno Cuadriculado", 1200, 8));
        cuadernos.add(new Producto("Cuaderno de Dibujo", 1500, 5));

        // ✏️ Categoría: Lapiceras
        List<Producto> lapiceras = new ArrayList<>();
        lapiceras.add(new Producto("Lapicera Azul", 500, 15));
        lapiceras.add(new Producto("Lapicera Negra", 500, 12));
        lapiceras.add(new Producto("Lapicera Roja", 500, 10));

        // 📏 Categoría: Reglas y accesorios
        List<Producto> reglas = new ArrayList<>();
        reglas.add(new Producto("Regla 30cm", 800, 20));
        reglas.add(new Producto("Compás Metálico", 2500, 5));

        // Agregar las categorías al catálogo
        categorias.put("Cuadernos", cuadernos);
        categorias.put("Lapiceras", lapiceras);
        categorias.put("Reglas y accesorios", reglas);
    }

    public Map<String, List<Producto>> getCategorias() {
        return categorias;
    }

    public void mostrarCategorias() {
        System.out.println("\nCategorías disponibles:");
        int i = 1;
        for (String categoria : categorias.keySet()) {
            System.out.println(i + ". " + categoria);
            i++;
        }
    }

    public void mostrarProductos(String categoria) {
        List<Producto> productos = categorias.get(categoria);
        System.out.println("\nProductos en " + categoria + ":");
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i));
        }
    }

    public Producto obtenerProducto(String categoria, int indice) {
        List<Producto> productos = categorias.get(categoria);
        if (indice >= 0 && indice < productos.size()) {
            return productos.get(indice);
        }
        return null;
    }
}

