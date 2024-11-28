
package persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import logica.Movimientos;
public class MovimientoRepositorio {
    private final List<Movimientos> movimientos = new  ArrayList<>();
    
    //metodo para añadir movimientos
    public void agragarMovimiento(Movimientos movimiento){
        movimientos.add(movimiento);
    }
    
    
    public Optional<Movimientos> obtenerMovimientoPorId(int id) {
        return movimientos.stream().filter(p -> p.getId() == id).findFirst();
    }
    //
    public List<Movimientos> ListarMovimientos(){
        return new ArrayList<>(movimientos); 
    }
}
