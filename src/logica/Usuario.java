package logica;

public class Usuario {
    
    private int id;
    
    private String nombre;
    
    private String apellido;
    
    private String tipoDocumentoIdentificacion;
    
    private String númeroDocumento;
    
    private String direccion;
    
    private String telefono;
    
    private boolean estado;
    
    private String email;
    
    private String contrasena;
    
    private String rol;

    public Usuario(int id, String nombre, String apellido, String tipoDocumentoIdentificacion, String númeroDocumento, 
               String direccion, String telefono, boolean estado, String email, 
               String contrasena, String rol) {
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.tipoDocumentoIdentificacion = tipoDocumentoIdentificacion;
    this.númeroDocumento = númeroDocumento;
    this.direccion = direccion;
    this.telefono = telefono;
    this.estado = estado;
    this.email = email;
    this.contrasena = contrasena;
    this.rol = rol; // Asignar rol
}

    public String getRol() {
        return rol;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public String getContrasena(){
        return contrasena;
    }
    
    public void setContrasena(String contrasena){
        this.contrasena = contrasena;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumentoIdentificacion() {
        return tipoDocumentoIdentificacion;
    }

    public void setTipoDocumentoIdentificacion(String tipoDocumentoIdentificacion) {
        this.tipoDocumentoIdentificacion = tipoDocumentoIdentificacion;
    }

    public String getNúmeroDocumento() {
        return númeroDocumento;
    }

    public void setNúmeroDocumento(String númeroDocumento) {
        this.númeroDocumento = númeroDocumento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTeléfono() {
        return telefono;
    }

    public void setTeléfono(String teléfono) {
        this.telefono = teléfono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
