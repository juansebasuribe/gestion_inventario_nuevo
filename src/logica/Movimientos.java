
package logica;

import java.time.LocalDate;

public class Movimientos {
    private int id;
    private LocalDate fechaMovimiento;
    Producto productoMovimiento;
    private TipoMovimiento tipoMovimiento;
    private int cantidad;
    private String motivo;

    public Movimientos(int id, LocalDate fechaMovimiento, Producto productoMovimiento, TipoMovimiento tipoMovimiento, int cantidad, String motivo) {
        this.id = id;
        this.fechaMovimiento = fechaMovimiento;
        this.productoMovimiento = productoMovimiento;
        this.tipoMovimiento = tipoMovimiento;
        this.cantidad = cantidad;
        this.motivo = motivo;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    

    public int getId() {
        return id;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public String getMotivo() {
        return motivo;
    }

    public LocalDate getFechaMovimiento() {
        return fechaMovimiento;
    }

    public Producto getProductoMovimiento() {
        return productoMovimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setFechaMovimiento(LocalDate fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public void setProductoMovimiento(Producto productoMovimiento) {
        this.productoMovimiento = productoMovimiento;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Movimientos{" + "id=" + id + ", fechaMovimiento=" + fechaMovimiento + ", productoMovimiento=" + productoMovimiento + ", tipoMovimiento=" + tipoMovimiento + ", cantidad=" + cantidad + ", motivo=" + motivo + '}';
    }
    
    
    
    
}
