
package persistencia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import logica.Usuario;

public class UsuarioRepositorio {
    static ArrayList<Usuario> instanciaUsuario = new ArrayList<>();
    
   public void crearUsuario(int id, String nombre, String apellido, String tipoDocumento, String documento,
                            String direccion, String telefono, boolean estado, String correo, 
                            String contrasena, String rol) {
      Usuario usuario = new Usuario(id, nombre, apellido, tipoDocumento, documento, direccion, telefono, 
                                    estado, correo, contrasena, rol);
      instanciaUsuario.add(usuario);
    }

    
    public void modificarUsuario(int id, String _nombre, String _apellido, String documentoIdentificacion, 
            String _numeroDocumento, String _direccion, String _tel, boolean _estado, String _email, String contrasena){
        
        for (Usuario usuario : instanciaUsuario) {
            if (usuario.getId() == id) {
                usuario.setNombre(_nombre);
                usuario.setApellido(_apellido);
                usuario.setDireccion(_direccion);
                usuario.setTipoDocumentoIdentificacion(documentoIdentificacion);
                usuario.setNúmeroDocumento(_numeroDocumento);
                usuario.setTeléfono(_tel);
                usuario.setEstado(_estado);
                usuario.setEmail(_email);
                usuario.setContrasena (contrasena);
                System.out.println("Usuario modificado con exito...");
                return;
            }
        }System.out.println("El usuario no fue encontrado");
    }
    
    public void imprimirUsuarios() {
    for (Usuario usuario : instanciaUsuario) {
        System.out.println("ID: " + usuario.getId());
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellido());
        System.out.println("Tipo de Documento: " + usuario.getTipoDocumentoIdentificacion());
        System.out.println("Número de Documento: " + usuario.getNúmeroDocumento());
        System.out.println("Dirección: " + usuario.getDireccion());
        System.out.println("Teléfono: " + usuario.getTeléfono());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Estado: " + (usuario.isEstado() ? "Activo" : "Inactivo"));
        System.out.println("-------------------------"); // Separador entre usuarios
    }
    }
    
    public Usuario obtenerUsuarioPorCorreo(String correo){
        for (Usuario usuario : instanciaUsuario) {
            if (usuario.getEmail().equals(correo)) {
                System.out.println("usuario encontrado por el correo " + correo);
                return usuario;
            }
            
        }
        return null;
    }
    
    public ArrayList<Usuario> obtenerUsuarios() {
        return instanciaUsuario;
    }
    
    public void activarUsuario(int id){
        for (Usuario usuario : instanciaUsuario) {
            if (usuario.getId() == id) {
                usuario.setEstado(true);
                break;
            }
        }
    }
    
    public void inactivarUsuario(int id){
        for (Usuario usuario : instanciaUsuario) {
            if (usuario.getId() == id) {
                usuario.setEstado(false);
                break;
                
            }
        }
    }
}
