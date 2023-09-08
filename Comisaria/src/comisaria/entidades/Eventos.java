package comisaria.entidades;

import java.time.LocalDate;
import java.time.LocalTime;

public class Eventos {
    private int idCaso;
    private char tipoCaso;
    private LocalDate fecha;
    private LocalTime hora;
    private String direccion;
    private Personas personaAsociada;
    private Objetos objetoAsociado;

    public Eventos(){}

    public Eventos(int idCaso, char tipoCaso, LocalDate fecha, LocalTime hora, String direccion,
            Personas personaAsociada, Objetos objetoAsociado) {
        this.idCaso = idCaso;
        this.tipoCaso = tipoCaso;
        this.fecha = fecha;
        this.hora = hora;
        this.direccion = direccion;
        this.personaAsociada = personaAsociada;
        this.objetoAsociado = objetoAsociado;
    }

    public Eventos(char tipoCaso, LocalDate fecha, LocalTime hora, String direccion,
                   Personas personaAsociada, Objetos objetoAsociado) {
        
        this.tipoCaso = tipoCaso;
        this.fecha = fecha;
        this.hora = hora;
        this.direccion = direccion;
        this.personaAsociada = personaAsociada;
        this.objetoAsociado = objetoAsociado;
    }
    
}
