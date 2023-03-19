
package com.mycompany.conectandojavasqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Haisenberg
 */
public class ConectionSQLServer2 {
    //Definimos las variables con los datos de conexion
    String database_name = "dbprueba";
    String user = "hacker";
    String password = "root";
    String url = "jdbc:sqlserver://DESKTOP-VFCJ6Q5:1433;databaseName="+database_name+";trustServerCertificate=true";
    
    Connection conn = null;
    
    //Metodo para conectar java con SQLServer
    public Connection getConnection(){
        try {
            //Cargar y registrar el controlador JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Establecer la conexion
            conn = DriverManager.getConnection(url,user,password);
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error"+e.getMessage());
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error SQLException"+e.getMessage());
        }
        return conn;
    }
}
