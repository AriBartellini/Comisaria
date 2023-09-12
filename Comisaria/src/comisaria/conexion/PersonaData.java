package comisaria.conexion;

import comisaria.entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class PersonaData {

    private Connection con = null;

    public PersonaData() {
        con = Conexion.getConexion();
    }

    public void guardarPersona(Persona persona) {
        String sqlInsert = "INSERT INTO persona(tipo, nombre,"
                + "apellido, dni, direccion, fechaNac, lugarNac, "
                + "ocupacion, antecedentes) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, persona.getTipo());
            ps.setString(2, persona.getNombre());
            ps.setString(3, persona.getApellido());
            ps.setInt(4, persona.getDni());
            ps.setString(5, persona.getDireccion());
            ps.setDate(6, persona.getFechaNac());
            ps.setString(7, persona.getOcupacion());
            ps.setString(8, persona.getLugarNac());
            ps.setBoolean(9, persona.getAntecedentes());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                persona.setIdPersona(rs.getInt("idPersona"));
                JOptionPane.showMessageDialog(null, "Persona agregada con éxito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Persona"
                    + ex.getMessage());
        }
    }

    public Persona buscarPersonaPorDni(int dni) {
        Persona persona = null;
        String sqlSelect = "SELECT tipo, nombre, apellido, dni, direccion, "
                + "fechaNac, lugarNac, ocupacion, personasAsociadas,"
                + " lugaresAsociados, antecedentes FROM persona WHERE dni=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sqlSelect);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                persona = new Persona();
                persona.setTipo(rs.getString("tipo"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setDni(rs.getInt("dni"));
                persona.setDireccion(rs.getString("direccion"));
                persona.setFechaNac(rs.getDate("fechaNac"));
                persona.setLugarNac(rs.getString("lugarNac"));
                persona.setOcupacion(rs.getString("ocupacion"));
                persona.setLugaresAsociados(rs.getString("lugaresAsociados"));
                persona.setAntecedentes(false);

            } else {
                JOptionPane.showMessageDialog(null, "No existe la persona en la BD");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Persona"
                    + ex.getMessage());
        }
        return persona;
    }

    public Persona buscarPersonaPorApellido(String apellido) {
        Persona persona = null;
        String sqlSelect = "SELECT tipo, nombre, apellido, dni, direccion, "
                + "fechaNac, lugarNac, ocupacion, personasAsociadas,"
                + " lugaresAsociados, antecedentes FROM persona WHERE apellido=?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sqlSelect);
            ps.setString(1, apellido);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                persona = new Persona();
                persona.setTipo(rs.getString("tipo"));
                persona.setNombre(rs.getString("nombre"));
                persona.setApellido(rs.getString("apellido"));
                persona.setDni(rs.getInt("dni"));
                persona.setDireccion(rs.getString("direccion"));
                persona.setFechaNac(rs.getDate("fechaNac"));
                persona.setLugarNac(rs.getString("lugarNac"));
                persona.setOcupacion(rs.getString("ocupacion"));
                persona.setLugaresAsociados(rs.getString("lugaresAsociados"));
                persona.setAntecedentes(false);

            } else {
                JOptionPane.showMessageDialog(null, "No existe la persona en la BD");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Persona"
                    + ex.getMessage());
        }
        return persona;
    }

    public List<Persona> listarPersonas() {
        List<Persona> personas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM alumno WHERE estado = 1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Persona persona = new Persona();
                
                persona.setIdPersona(rs.getInt("idPersona"));
                persona.setDni(rs.getInt("dni"));
                persona.setApellido(rs.getString("apellido"));
                persona.setNombre(rs.getString("nombre"));
                persona.setFechaNac(rs.getDate("fechaNac"));
                persona.setAntecedentes(rs.getBoolean("antecedentes"));
                persona.setOcupacion(rs.getString("ocupacion"));
                
                personas.add(persona);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Persona"
                    + ex.getMessage());
        }
        return personas;
    }
}
