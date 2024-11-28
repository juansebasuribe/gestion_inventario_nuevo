
package logica;

import java.time.LocalDate;
import java.util.List;
import persistencia.ProductoRepositorio;

public class ProductoServicio {
    private final MovimientosServicio movimientosServicio;
    private final ProductoRepositorio productoRepositorio;

    public ProductoServicio(ProductoRepositorio productoRepositorio, MovimientosServicio movimientosServicio) {
        this.productoRepositorio = productoRepositorio;
        this.movimientosServicio = movimientosServicio;
    }

    public void registrarProducto(Producto producto) {
        productoRepositorio.agregarProducto(producto);
    }

    public Producto consultarProducto(int id) {
        return productoRepositorio.obtenerProductoPorId(id).orElse(null);
    }

    public void actualizarProducto(Producto producto, int cantidad, String motivo, TipoMovimiento tipoMovimiento) {
        productoRepositorio.actualizarProducto(producto);

        // Crear un nuevo movimiento y registrarlo
        Movimientos movimiento = new Movimientos(
            generarIdMovimiento(), 
            LocalDate.now(),
            producto,
            tipoMovimiento,
            cantidad,
            motivo
        );
        movimientosServicio.registrarMovimiento(movimiento);
    }

    // Método para generar un ID único para los movimientos
    private int generarIdMovimiento() {
        return movimientosServicio.ObtenerMovimientos().size() + 1; 
    }

    public void eliminarProducto(int id) {
        productoRepositorio.eliminarProducto(id);
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepositorio.listarProductos();
    }
}
