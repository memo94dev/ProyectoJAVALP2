/* Conectar a la Base de Datos */
package prg;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectDB {
    
    Connection con; // Variable administrador de base de datos
    Statement state; // Variable para ejecutar sql
    ResultSet resultado; // Variable que recibe los resultados de las sentencias sq

    // Variables para conexión
    String host = "jdbc:postgresql://localhost/";
    String bd = "proyecto";
    String user = "postgres";
    String pass = "123456";
    
    public Connection conectar(){
        try {
            Class.forName("org.postgresql.Driver");
            try {
                con = DriverManager.getConnection(host+bd,user,pass);
            } catch (SQLException ex) {
                Logger.getLogger(conectDB.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(conectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
   // Listar Datos
    public ResultSet Listar(String consulta) {
        try {
            state = con.createStatement(ResultSet.CONCUR_READ_ONLY,ResultSet.TYPE_SCROLL_INSENSITIVE);
            resultado = state.executeQuery(consulta);
        } catch (SQLException ex) {
            Logger.getLogger(conectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    // Buscar Datos
    public boolean busqueda(String query) {
        try {
            state = con.createStatement();
            resultado = state.executeQuery(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(conectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    // Insertar Datos
    public void insertar_datos(String tabla, String campos, String valores, int mensaje){
        try {
            state = con.createStatement();
            state.executeUpdate("insert into " +tabla+ "("+campos+ ")"
                    +"values("+valores+")");
            switch(mensaje){
                case 1:
                    JOptionPane.showMessageDialog(null, "Se ha grabado exitosamente", "Atención",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("insert into " +tabla+ "("+campos+ ")"
                    +"values("+valores+")");
            JOptionPane.showMessageDialog(null, "Error en la operación", "Atención",
                            JOptionPane.WARNING_MESSAGE);
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    // Modificar Datos
    public void actualizar_datos(String tabla, String camposAct, String codigo, int mensaje) {
        try {
            state = con.createStatement();
            state.executeUpdate("update " + tabla + " set " + camposAct + " where "
                    + codigo, mensaje);
            switch (mensaje) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Se ha actualizado exitosamente", "Atención",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Se ha anulado correctamente", "Atención",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } catch (SQLException ex) {
            System.out.println("update " + tabla + " set " + camposAct + " where "
                    + codigo);
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la operación", "Atención",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    
    // Eliminar Datos
    public void borrar_datos(String tabla, String campoCodigo, String codigo) {
        try {
            state = con.createStatement();
            state.executeUpdate("delete from " + tabla + " where " + campoCodigo
                    + " = " + codigo + ";");
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente", "Atención",
                    JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            System.out.println("delete from " + tabla + " where " + campoCodigo
                    + " = " + codigo + ";");
            javax.swing.JOptionPane.showMessageDialog(null, ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en la operación", "Atención",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

}
