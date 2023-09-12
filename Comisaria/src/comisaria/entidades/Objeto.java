package comisaria.entidades;

public class Objeto {
    private int idObj;
    private String nombre;
    private String descripcion;
    private double peso;

    public Objeto() {
    }

    public Objeto(int idObj, String nombre, String descripcion, double peso) {
        this.idObj = idObj;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.peso = peso;
    }

    public int getIdObj() {
        return idObj;
    }

    public void setIdObj(int idObj) {
        this.idObj = idObj;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Objeto: {" +
                "id=" + idObj +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", peso=" + peso +
                '}';
    }
}
