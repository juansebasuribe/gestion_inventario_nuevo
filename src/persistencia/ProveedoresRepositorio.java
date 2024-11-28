package persistencia;

import java.util.ArrayList;
import java.util.List;
import logica.Proveedores;

public class ProveedoresRepositorio {
    static ArrayList<Proveedores> instanciaProveedores = new ArrayList<>();
    
    public void crearProveedor(int id, String nombreProveedor, String direccionProveedor, int telefonoProveedor) {
        Proveedores nuevoProveedor = new Proveedores(id, nombreProveedor, direccionProveedor, telefonoProveedor);
        instanciaProveedores.add(nuevoProveedor);
    }

    public void modificarProveedor(int id, String nombreProveedor, String direccionProveedor, int telefonoProveedor) {
        for (Proveedores proveedor : instanciaProveedores) {
            if (proveedor.getId() == id) {
                proveedor.setNombreProveedor(nombreProveedor);
                proveedor.setDireccioonProveedor(direccionProveedor);
                proveedor.setTelefonoProveedor(telefonoProveedor);
                System.out.println("Proveedor modificado con éxito...");
                return;
            }
        }
        System.out.println("El proveedor no fue encontrado");
    }

    public void imprimirProveedores() {
        for (Proveedores proveedor : instanciaProveedores) {
            System.out.println("ID: " + proveedor.getId());
            System.out.println("Nombre: " + proveedor.getNombreProveedor());
            System.out.println("Dirección: " + proveedor.getDireccioonProveedor());
            System.out.println("Teléfono: " + proveedor.getTelefonoProveedor());
            System.out.println("-------------------------"); // Separador entre proveedores
        }
    }

    public Proveedores obtenerProveedorPorNombre(String nombre) {
        for (Proveedores proveedor : instanciaProveedores) {
            if (proveedor.getNombreProveedor().equalsIgnoreCase(nombre)) {
                System.out.println("Proveedor encontrado por el nombre: " + nombre);
                return proveedor;
            }
        }
        return null;
    }

    public ArrayList<Proveedores> obtenerProveedores() {
        return instanciaProveedores;
    }

    public void activarProveedor(int id) {
        for (Proveedores proveedor : instanciaProveedores) {
            if (proveedor.getId() == id) {
                // Lógica para activar (si se requiere)
                System.out.println("Proveedor activado");
                break;
            }
        }
    }

    public void inactivarProveedor(int id) {
        for (Proveedores proveedor : instanciaProveedores) {
            if (proveedor.getId() == id) {
                // Lógica para inactivar (si se requiere)
                System.out.println("Proveedor inactivado");
                break;
            }
        }
    }
    
     
}
