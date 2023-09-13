package comisaria;

import comisaria.conexion.Conexion;
import comisaria.conexion.PersonaData;
import comisaria.entidades.Persona;
import java.sql.Date;

public class Comisaria {

    public static void main(String[] args) {
        Conexion c = new Conexion();
        c.buscarConexion();
            //C=culpables, S=sospechosos, T=testigos, V=visitantes, P=personal, D=detenidos, 
            //public Persona(String tipo, String nombre, String apellido, int dni, String direccion,
            //Date fechaNac, String lugarNac, String ocupacion, Persona personaAsociada, String lugaresAsociados, boolean antecedentes)
            /*
             Persona ejemplo1 = new Persona("D","Juan", "Palotes", 45888555, "Av. Calle 123",Date.valueOf("1995-02-15"), "La Pampa", null, null, null, false);
            PersonaData ejemplo = new PersonaData(); 
            ejemplo.guardarPersona(ejemplo1);
             */
    }
}
