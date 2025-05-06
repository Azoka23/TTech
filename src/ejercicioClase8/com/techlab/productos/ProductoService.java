package ejercicioClase8.com.techlab.productos;



import ejercicioClase8.com.techlab.excepciones.ProductoNoEncontradoException;

import java.util.List;

public class ProductoService {

    private List<Producto> productos;

    public ProductoService(List<Producto> productos) {
        this.productos = productos;
    }

    public Producto buscarProductoPorNombre(String nombre) throws ProductoNoEncontradoException {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        throw new ProductoNoEncontradoException("Producto no encontrado: " + nombre);
    }
}

