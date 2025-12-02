package modelos;

public class Implemento {
    private String idImplemento;
    private String nombre;
    private String tipo;
    private int stock;
    private double precio;

    public Implemento() {}

    public Implemento(String idImplemento, String nombre, String tipo, int stock, double precio) {
        this.idImplemento = idImplemento;
        this.nombre = nombre;
        this.tipo = tipo;
        this.stock = stock;
        this.precio = precio;
    }

    // Getters y Setters
    public String getIdImplemento() {
        return idImplemento;
    }

    public void setIdImplemento(String idImplemento) {
        this.idImplemento = idImplemento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Implemento{" +
                "idImplemento='" + idImplemento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }
}