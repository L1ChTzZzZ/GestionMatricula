
package modelos;

public class Profesor {
    private String dniProfesor;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private String telefono;

    public Profesor() {
    }

    public Profesor(String dniProfesor, String nombre, String apellido, String correo, String direccion, String telefono) {
        this.dniProfesor = dniProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getDniProfesor() {
        return dniProfesor;
    }

    public void setDniProfesor(String dniProfesor) {
        this.dniProfesor = dniProfesor;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}