package logica;

import java.util.List;
import persistencia.ProveedoresRepositorio;

public class ProveedoresServicio {
    
    private final ProveedoresRepositorio proveedorRepositorio;
    
    // Inicializamos el constructor
    public ProveedoresServicio() {
        this.proveedorRepositorio = new ProveedoresRepositorio();
    }
    
    // Método para validar un proveedor por su nombre
    public boolean validarProveedor(String nombre) {
        Proveedores proveedor = proveedorRepositorio.obtenerProveedorPorNombre(nombre);
        return proveedor != null;
    }
    
    // Método para registrar un proveedor
    public void registrarProveedor(int id, String nombreProveedor, String direccionProveedor, int telefonoProveedor) {
        proveedorRepositorio.crearProveedor(id, nombreProveedor, direccionProveedor, telefonoProveedor);
    }

    // Método para modificar un proveedor
    public void modificarProveedor(int id, String nombreProveedor, String direccionProveedor, int telefonoProveedor) {
        proveedorRepositorio.modificarProveedor(id, nombreProveedor, direccionProveedor, telefonoProveedor);
    }

    // Método para obtener un proveedor por nombre
    public Proveedores obtenerProveedorPorNombre(String nombre) {
        return proveedorRepositorio.obtenerProveedorPorNombre(nombre);
    }
    
    public List<Proveedores> obtenerTodosLosProveedores() {
        return proveedorRepositorio.obtenerProveedores();
    }

    // Método para listar todos los proveedores
    public void listarProveedores() {
        proveedorRepositorio.imprimirProveedores();
    }
    
    // Método para activar un proveedor
    public void activarProveedor(int id) {
        proveedorRepositorio.activarProveedor(id);
    }

    // Método para inactivar un proveedor
    public void inactivarProveedor(int id) {
        proveedorRepositorio.inactivarProveedor(id);
    }
}
