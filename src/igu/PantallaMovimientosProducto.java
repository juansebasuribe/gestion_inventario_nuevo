package igu;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import logica.Movimientos;
import logica.MovimientosServicio;

public class PantallaMovimientosProducto extends JFrame{

   
    private final MovimientosServicio movimientosServicio;
    private JTable tablaMovimientos;
    private DefaultTableModel modelo;
    
     public PantallaMovimientosProducto(MovimientosServicio movimientosServicio1) {
        this.movimientosServicio = movimientosServicio1;
        inicializarComponentes();
    }
     
     private void inicializarComponentes() {
        setTitle("Movimiento de productos");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Crear una tabla para mostrar los productos
        String[] columnas = {"ID", "Fecha Movimiento", "Producto", "Tipo Movimiento", "Cantidad", "Motivo"};
        modelo = new DefaultTableModel(columnas, 0);
        tablaMovimientos = new JTable(modelo);
        JScrollPane scrollPane = new JScrollPane(tablaMovimientos);
        add(scrollPane, BorderLayout.CENTER);

        cargarDatosProductos();
    }
     
     private void cargarDatosProductos(){
        modelo.setRowCount(0);
        List<Movimientos> movimientos = movimientosServicio.ObtenerMovimientos();
        for (Movimientos movimiento: movimientos){
            Object[] fila = {
                movimiento.getId(),
                movimiento.getFechaMovimiento(),
                movimiento.getProductoMovimiento(),
                movimiento.getTipoMovimiento(),
                movimiento.getCantidad(),
                movimiento.getMotivo()
            };
            modelo.addRow(fila);
        }
        
        //Actualizar tabla
        modelo.fireTableDataChanged();
     }
    
}
