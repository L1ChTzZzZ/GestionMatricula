
package Modelo;

public class ClaseCompleta {
    private String horario;
    private double mensualidad;
    private String descripcion;
    private String nombreProfesor;

    public ClaseCompleta(String horario, double mensualidad, String descripcion, String nombreProfesor) {
        this.horario = horario;
        this.mensualidad = mensualidad;
        this.descripcion = descripcion;
        this.nombreProfesor = nombreProfesor;
    }

    public String getHorario() {
        return horario;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }
}
