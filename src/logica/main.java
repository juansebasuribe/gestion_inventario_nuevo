package logica;

import igu.Pantalla;
import persistencia.UsuarioRepositorio;

public class main {
    public static void main(String[] args) {
        UsuarioRepositorio usuarioRepositorio = new UsuarioRepositorio();
        UsuarioServicio usuarioServicio = new UsuarioServicio();
        
        // Crear usuarios
        usuarioServicio.crearUsuario(0, "Alejandro", "Uribe", "cc", "1088313262", "manzana 29", "3216193593", true, "alejo@gmail.com", "123", "auxi");
        usuarioServicio.crearUsuario(1, "Andrea", "Valor", "cc", "1088313262", "manzana 29", "3216193593", true, "andrea@gmail.com", "234", "Administrador");
        usuarioServicio.crearUsuario(2, "Juan", "Uribe", "cc", "1088313262", "manzana 29", "3216193593", true, "juan@gmail.com", "345", "Administrador");
            usuarioServicio.crearUsuario(3, "Juan Jose", "Uribe", "cc", "1088313262", "manzana 29", "3216193593", true, "juanjo@gmail.com", "456", "Administrador");
        
        Pantalla panta = new Pantalla();
        panta.setVisible(true);
        panta.setLocationRelativeTo(null);
    }
}
