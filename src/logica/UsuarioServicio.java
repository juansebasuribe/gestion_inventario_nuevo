package logica;

import persistencia.UsuarioRepositorio;

public class UsuarioServicio {
    
    private final UsuarioRepositorio usuarioRepositorio;
    
    //inicializamos constructor
    public UsuarioServicio(){
        this.usuarioRepositorio = new UsuarioRepositorio();
    }
    
    public void crearUsuario(int id, String nombre, String apellido, String tipoDocumento, String documento, 
                              String direccion, String telefono, boolean estado, String correo, 
                              String contrasena, String rol) {
        // Aquí podrías hacer validaciones o lógica de negocio antes de crear el usuario
        usuarioRepositorio.crearUsuario(id, nombre, apellido, tipoDocumento, documento, direccion, telefono, 
                                        estado, correo, contrasena, rol);
    }
    
    public boolean validarUsuario(String correo, String contraseña){
        
        Usuario usuario = usuarioRepositorio.obtenerUsuarioPorCorreo(correo);
        return usuario != null  && usuario.getContrasena().equals(contraseña);
    }
   
}
