package comisaria.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Caso {
    private int idCaso;
    private char tipoCaso;
    private LocalDate fecha;
    private LocalTime hora;
    private String direccion;
    private Persona personaAsociada;
    private Objeto objetoAsociado;

    public Caso() {
    }

    public Caso(int idCaso, char tipoCaso, LocalDate fecha, LocalTime hora, String direccion,
            Persona personaAsociada, Objeto objetoAsociado) {
        this.idCaso = idCaso;
        this.tipoCaso = tipoCaso;
        this.fecha = fecha;
        this.hora = hora;
        this.direccion = direccion;
        this.personaAsociada = personaAsociada;
        this.objetoAsociado = objetoAsociado;
    }

    public Caso(char tipoCaso, LocalDate fecha, LocalTime hora, String direccion,
            Persona personaAsociada, Objeto objetoAsociado) {

        this.tipoCaso = tipoCaso;
        this.fecha = fecha;
        this.hora = hora;
        this.direccion = direccion;
        this.personaAsociada = personaAsociada;
        this.objetoAsociado = objetoAsociado;
    }

    public int getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(int idCaso) {
        this.idCaso = idCaso;
    }

    public char getTipoCaso() {
        return tipoCaso;
    }

    public void setTipoCaso(char tipoCaso) {
        this.tipoCaso = tipoCaso;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Persona getPersonaAsociada() {
        return personaAsociada;
    }

    public void setPersonaAsociada(Persona personaAsociada) {
        this.personaAsociada = personaAsociada;
    }

    public Objeto getObjetoAsociado() {
        return objetoAsociado;
    }

    public void setObjetoAsociado(Objeto objetoAsociado) {
        this.objetoAsociado = objetoAsociado;
    }

    @Override
    public String toString() {
        return "Caso{" +
                "idCaso=" + idCaso +
                ", tipoCaso=" + tipoCaso +
                ", fecha=" + fecha +
                ", hora=" + hora +
                ", direccion='" + direccion + '\'' +
                ", personaAsociada=" + personaAsociada +
                ", objetoAsociado=" + objetoAsociado +
                '}';
    }
}
