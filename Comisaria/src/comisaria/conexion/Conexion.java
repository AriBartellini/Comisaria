package comisaria.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Conexion {

    private String url = "jdbc:mariadb://localhost/";
    private String BD = "comisaria"; // cambiarlo de acuerdo a la BD
    private String usuario = "root";
    private String password = "";

    private static Connection conexion = null;
   
    public Conexion(){}

    public Conexion(String url, String BD, String usr, String pass) {
        this.url = url; // "jdbc:mariabd://localhost/"
        this.BD = BD;
        this.usuario = usr;
        this.password = pass;
    }

    public Connection buscarConexion() {
        
        if (conexion == null) { 
            try {
                // cargamos las clases de mariadb que implementan JDBC
                Class.forName("org.mariadb.jdbc.Driver");
                conexion = DriverManager.getConnection(url+BD, usuario, password);
            } catch (SQLException | ClassNotFoundException ex) { 
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            //} catch (SQLException ex) {
            //    JOptionPane.showMessageDialog(null, "Error al cargar los drivers");
            }
            
        }else {
            System.out.println("Conexion a la BD realizada con exito"); 
        }
        
        return conexion;
       
    }

    public static Connection getConexion() {
        return conexion;
    }

    public static void setConexion(Connection conexion) {
        Conexion.conexion = conexion;
    }
    
    
}
