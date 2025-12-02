package modelos;

public class Clase {

    private String id_clase;
    private String horario;  // HH:mm:ss
    private double mensualidad;

    public Clase() {}

    public Clase(String id_clase, String horario, double mensualidad) {
        this.id_clase = id_clase;
        this.horario = horario;
        this.mensualidad = mensualidad;
    }

    public String getId_clase() {
        return id_clase;
    }

    public void setId_clase(String id_clase) {
        this.id_clase = id_clase;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
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
                "id_clase='" + id_clase + '\'' +
                ", horario='" + horario + '\'' +
                ", mensualidad=" + mensualidad +
                '}';
    }
}
