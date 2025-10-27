package Modelo;

public class DetalleClase {
    private String idDetallesClases;
    private String descripcion;
    private String idClase;
    private String dniProfesor;

    public DetalleClase() {}

    public DetalleClase(String idDetallesClases, String descripcion, String idClase, String dniProfesor) {
        this.idDetallesClases = idDetallesClases;
        this.descripcion = descripcion;
        this.idClase = idClase;
        this.dniProfesor = dniProfesor;
    }

    // Getters y Setters
    public String getIdDetallesClases() {
        return idDetallesClases;
    }

    public void setIdDetallesClases(String idDetallesClases) {
        this.idDetallesClases = idDetallesClases;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdClase() {
        return idClase;
    }

    public void setIdClase(String idClase) {
        this.idClase = idClase;
    }

    public String getDniProfesor() {
        return dniProfesor;
    }

    public void setDniProfesor(String dniProfesor) {
        this.dniProfesor = dniProfesor;
    }

    @Override
    public String toString() {
        return "DetalleClase{" +
                "idDetallesClases='" + idDetallesClases + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", idClase='" + idClase + '\'' +
                ", dniProfesor='" + dniProfesor + '\'' +
                '}';
    }
}