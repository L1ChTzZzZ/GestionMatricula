
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Cconexion {
    Connection conectar;
    
    String usuario = "root";
    String contraseña = "root";
    String bd = "INKAWARRIOR";
    String ip = "localhost";
    String puerto = "3306";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableConexion() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            //JOptionPane.showMessageDialog(null, "Se conecto correctamente a la bd");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Problemas en la conexion: "+ e.toString());
        }
        return conectar;
    }
}