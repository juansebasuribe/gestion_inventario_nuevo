
package logica;
import java.time.LocalDate;
public class Producto {
    
    private short id;
    private String nombreProducto;
    private String categoria;
    private int cantidad;
    private double precioUnitario;
    private LocalDate fechaExpiracion;
    
    // Constructor, getters y setters
    public Producto(short id, String nombreProducto, String categoria, int cantidad, double precioUnitario, LocalDate fechaExpiracion) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    
    public LocalDate getfechaExpiracion (){
        return fechaExpiracion;
    }

    public void setId(short id) {
        this.id = id;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    public void setFechaExpiracion(LocalDate fechaExpiracion){
        this.fechaExpiracion = fechaExpiracion;
    }

    public Object getFechaExpiracion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
