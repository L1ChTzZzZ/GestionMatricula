package Modelo;

public class Clase {
    private String idClase;
    private java.sql.Date horario; // Usamos java.sql.Date para fechas SQL
    private double mensualidad;

    public Clase() {}

    public Clase(String idClase, java.sql.Date horario, double mensualidad) {
        this.idClase = idClase;
        this.horario = horario;
        this.mensualidad = mensualidad;
    }

    // Getters y Setters
    public String getIdClase() {
        return idClase;
    }

    public void setIdClase(String idClase) {
        this.idClase = idClase;
    }

    public java.sql.Date getHorario() {
        return horario;
    }

    public void setHorario(java.sql.Date horario) {
        this.horario = horario;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "idClase='" + idClase + '\'' +
                ", horario=" + horario +
                ", mensualidad=" + mensualidad +
                '}';
    }
}