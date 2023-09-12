package comisaria.entidades;

import java.sql.Date;

public class Persona {
    private int idPersona;
    private String tipo;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private Date fechaNac;
    private String lugarNac;
    private String ocupacion;
    private Persona personaAsociada;
    private String lugaresAsociados;
    private boolean antecedentes;

    public Persona() {
    };

    public Persona(String tipo, String nombre, String apellido, int dni, String direccion,
            Date fechaNac, String lugarNac, String ocupacion, Persona personaAsociada, String lugaresAsociados, boolean antecedentes) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.lugarNac = lugarNac;
        this.ocupacion = ocupacion;
        this.personaAsociada = personaAsociada;
        this.lugaresAsociados = lugaresAsociados;
        this.antecedentes = antecedentes;
    }

    public Persona(int idPersona, String tipo, String nombre, String apellido, int dni,
            String direccion, Date fechaNac, String lugarNac, String ocupacion,
            Persona personaAsociada, String lugaresAsociados, boolean antecedentes) {
        this.idPersona = idPersona;
        this.tipo = tipo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.lugarNac = lugarNac;
        this.ocupacion = ocupacion;
        this.personaAsociada = personaAsociada;
        this.lugaresAsociados = lugaresAsociados;
        this.antecedentes = antecedentes;
       
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getLugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Persona getPersonaAsociadas() {
        return personaAsociada;

    }

    public void setPersonaAsociada(Persona personaAsociada) {
        this.personaAsociada = personaAsociada;
    }

    public String getLugaresAsociados() {
        return lugaresAsociados;
    }

    public void setLugaresAsociados(String lugaresAsociados) {
        this.lugaresAsociados = lugaresAsociados;
    }

    public boolean getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(boolean antecedentes) {
        this.antecedentes = antecedentes;
    }

    
    @Override
    public String toString() {
        return "Personas{" +
                "idPersona=" + idPersona +
                ", tipo=" + tipo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni=" + dni +
                ", direccion='" + direccion + '\'' +
                ", fechaNac=" + fechaNac +
                ", lugarNac='" + lugarNac + '\'' +
                ", ocupacion='" + ocupacion + '\'' +
                ", personaAsociada=" + personaAsociada +
                ", lugaresAsociados='" + lugaresAsociados + '\'' +
                ", antecedentes=" + antecedentes +
                '}';
    }
}
