package comisaria.entidades;

import java.time.LocalDate;

public class Personas {
    private Int idPersona;
    private char tipo;
    private String nombre;
    private String apellido;
    private Int dni;
    private String direccion;
    private LocalDate fechaNac;
    private String lugarNac;
    private String ocupacion;
    private Personas personaAsociada;
    private String lugaresAsociados;
    private boolean antecedentes;

    public Personas() {
    };

    public Personas(Int idPersona, char tipo, java.lang.String nombre, java.lang.String apellido, Int dni,
            java.lang.String direccion, LocalDate fechaNac, java.lang.String lugarNac, java.lang.String ocupacion,
            Personas personaAsociada, java.lang.String lugaresAsociados, boolean antecedentes, java.lang.String string,
            java.lang.String personas) {
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
        String = string;
        Personas = personas;
    }

    public Int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Int idPersona) {
        this.idPersona = idPersona;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
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

    public Int getDni() {
        return dni;
    }

    public void setDni(Int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getlugarNac() {
        return lugarNac;
    }

    public void setLugarNac(String lugarNac) {
        this.lugarNac = lugarNac;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Personas getPersonasAsociadas(){
        return personaAsociada;

    }

    public void setPersonaAsociada(Persona personaAsociada){
        this.personaAsociada= personaAsociada;
    }

    public String getLugaresAsociados(){
        return lugaresAsociados;
    }

    public void setLugaresAsociados(String lugaresAsociados){
        this.lugaresAsociados=lugaresAsociados;
    }

    public boolean getAntecedentes(){
        return antecedentes;
    }

    public void setAntecedentes(boolean antecedentes){
        this.antecedentes=antecedentes;
    }

    

    @Override
    public String toString() {
        return "Personas [idPersona=" + idPersona + ", tipo=" + tipo + ", nombre=" + nombre
                + ", apellido=" + apellido + ", dni=" + dni + ", direccion=" + direccion + ", fechaNac="
                + fechaNac + ", lugarNac=" + lugarNac + ", ocupacion=" + ocupacion
                + ", personaAsociada=" + personaAsociada + ", lugaresAsociados=" + lugaresAsociados
                + ", antecedentes=" + antecedentes + "]";
    }

}
