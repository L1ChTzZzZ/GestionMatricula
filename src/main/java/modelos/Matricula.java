package modelos;

import java.sql.Date;

public class Matricula {
    private String idMatricula;
    private Date fechaPago;
    private double montoTotal;
    private String tipoPago;
    private String idUsuario;
    private String dniAlumno;
    private String idClase;

    public Matricula() {}

    public Matricula(String idMatricula, Date fechaPago, double montoTotal, String tipoPago,
                     String idUsuario, String dniAlumno, String idClase) {
        this.idMatricula = idMatricula;
        this.fechaPago = fechaPago;
        this.montoTotal = montoTotal;
        this.tipoPago = tipoPago;
        this.idUsuario = idUsuario;
        this.dniAlumno = dniAlumno;
        this.idClase = idClase;
    }

    // Getters y Setters
    public String getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public String getIdClase() {
        return idClase;
    }

    public void setIdClase(String idClase) {
        this.idClase = idClase;
    }

    @Override
    public String toString() {
        return "Matricula{" +
                "idMatricula='" + idMatricula + '\'' +
                ", fechaPago=" + fechaPago +
                ", montoTotal=" + montoTotal +
                ", tipoPago='" + tipoPago + '\'' +
                ", idUsuario='" + idUsuario + '\'' +
                ", dniAlumno='" + dniAlumno + '\'' +
                ", idClase='" + idClase + '\'' +
                '}';
    }
}