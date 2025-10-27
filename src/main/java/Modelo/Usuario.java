package Modelo;

public class Usuario {
    private String id_Usuario;
    private String ingresoUsuario;
    private String Nombre;
    private String ingresoContraseña;
    private String rol;

    // Constructor vacío (necesario para crear objetos sin datos iniciales)
    public Usuario() {
    }

    // Constructor completo (para cuando cargamos desde BD)
    public Usuario(String id_Usuario, String ingresoUsuario,String Nombre, String ingresoContraseña, String rol) {
        this.id_Usuario = id_Usuario;
        this.ingresoUsuario = ingresoUsuario;
        this.Nombre = Nombre;
        this.ingresoContraseña = ingresoContraseña;
        this.rol = rol;
    }

    public Usuario(String ingresoUsuario, String ingresoContraseña) {
        this.ingresoUsuario = ingresoUsuario;
        this.ingresoContraseña = ingresoContraseña;
    }

    // Getters y Setters
    public String getIdUsuario() {
        return id_Usuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.id_Usuario = idUsuario;
    }

    public String getIngresoUsuario() {
        return ingresoUsuario;
    }
    
    public void setIngresoUsuario(String ingresoUsuario) {
        this.ingresoUsuario = ingresoUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombreUsuario(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getIngresoContraseña() {
        return ingresoContraseña;
    }

    public void setIngresoContraseña(String ingresoContraseña) {
        this.ingresoContraseña = ingresoContraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" + 
                "idUsuario=" + id_Usuario + 
                ", ingresoUsuario='" + ingresoUsuario + '\'' + 
                ", rol='" + rol + '\'' + 
                '}';
    }
}