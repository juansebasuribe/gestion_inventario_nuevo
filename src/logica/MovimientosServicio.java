
package logica;

import java.util.List;
import persistencia.MovimientoRepositorio;

public class MovimientosServicio {

    
    private final MovimientoRepositorio movimientoRepositorio;
    
    public MovimientosServicio(MovimientoRepositorio movimientoRepositorio) {
        this.movimientoRepositorio = movimientoRepositorio;
    }
    
     public void registrarMovimiento(Movimientos movimiento) {
        movimientoRepositorio.agragarMovimiento(movimiento);
    }
    
    public Movimientos consultarMovimiento(int id) {
        return movimientoRepositorio.obtenerMovimientoPorId(id).orElse(null);
    }
    public List<Movimientos> ObtenerMovimientos(){
        return movimientoRepositorio.ListarMovimientos();
    }
    
    
    
    
}
