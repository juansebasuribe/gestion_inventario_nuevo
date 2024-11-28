
package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import logica.Producto;

public class ProductoRepositorio {
    private final List<Producto> productos = new ArrayList<>();

    // Método para agregar un producto
    public void agregarProducto(Producto producto) {    
        productos.add(producto);
    }

    // Método para obtener un producto por ID
    public Optional<Producto> obtenerProductoPorId(int id) {
        return productos.stream().filter(p -> p.getId() == id).findFirst();
    }

    // Método para actualizar un producto
    public void actualizarProducto(Producto productoActualizado) {
        obtenerProductoPorId(productoActualizado.getId()).ifPresent(producto -> {
            producto.setNombreProducto(productoActualizado.getNombreProducto());
            producto.setCategoria(productoActualizado.getCategoria());
            producto.setCantidad(productoActualizado.getCantidad());
            producto.setPrecioUnitario(productoActualizado.getPrecioUnitario());
            producto.setFechaExpiracion(productoActualizado.getfechaExpiracion());
        });
    }

    // Método para eliminar un producto por ID
    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }

    // Método para listar todos los productos
    public List<Producto> listarProductos() {
        return productos;
    }
}
