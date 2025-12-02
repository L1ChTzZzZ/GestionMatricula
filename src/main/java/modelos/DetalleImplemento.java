package modelos;

public class DetalleImplemento {
    private String idBoletaImplementos;
    private double precioUnitario;
    private String idMatricula;
    private String idImplemento;

    public DetalleImplemento() {}

    public DetalleImplemento(String idBoletaImplementos, double precioUnitario, String idMatricula, String idImplemento) {
        this.idBoletaImplementos = idBoletaImplementos;
        this.precioUnitario = precioUnitario;
        this.idMatricula = idMatricula;
        this.idImplemento = idImplemento;
    }

    // Getters y Setters
    public String getIdBoletaImplementos() {
        return idBoletaImplementos;
    }

    public void setIdBoletaImplementos(String idBoletaImplementos) {
        this.idBoletaImplementos = idBoletaImplementos;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getIdImplemento() {
        return idImplemento;
    }

    public void setIdImplemento(String idImplemento) {
        this.idImplemento = idImplemento;
    }

    @Override
    public String toString() {
        return "DetalleImplemento{" +
                "idBoletaImplementos='" + idBoletaImplementos + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", idMatricula='" + idMatricula + '\'' +
                ", idImplemento='" + idImplemento + '\'' +
                '}';
    }
}