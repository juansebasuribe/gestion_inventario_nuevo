
package logica;


public class Proveedores {
    private int id;
    private String nombreProveedor;
    private String direccioonProveedor;
    private int telefonoProveedor;

    public Proveedores(int id, String nombreProveedor, String direccioonProveedor, int telefonoProveedor) {
        this.id = id;
        this.nombreProveedor = nombreProveedor;
        this.direccioonProveedor = direccioonProveedor;
        this.telefonoProveedor = telefonoProveedor;
    }

    public int getId() {
        return id;
    }

    public String getNombreProveedor() {
        return nombreProveedor;
    }

    public String getDireccioonProveedor() {
        return direccioonProveedor;
    }

    public int getTelefonoProveedor() {
        return telefonoProveedor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }

    public void setDireccioonProveedor(String direccioonProveedor) {
        this.direccioonProveedor = direccioonProveedor;
    }

    public void setTelefonoProveedor(int telefonoProveedor) {
        this.telefonoProveedor = telefonoProveedor;
    }
    
    
}
