
package Modelo.DAO;

import Modelo.Cconexion;
import Modelo.ClaseCompleta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ClaseCompletaDAO {
    
    public void RellenarCB(String tabla, String valor, JComboBox combo){
        String sql = "select * from " + tabla;
        Statement st;
        Cconexion con = new Cconexion();
            Connection conexion = con.estableConexion();
            try{
                st = conexion.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    combo.addItem(rs.getString(valor));
                }
            } catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Error"+e.toString());
            }
    }
    
    public ClaseCompleta obtenerDatosClaseCompleta(String idClase) {
    Cconexion con = new Cconexion();
    
    ClaseCompleta datos = null;

    String sql = """
        SELECT 
            C.Horario,
            C.Mensualidad,
            D.Descripcion,
            P.Nombre AS NombreProfesor
        FROM CLASES C
        LEFT JOIN DETALLES_CLASES D ON C.id_clase = D.id_clase
        LEFT JOIN PROFESORES P ON D.Dni_profesor = P.Dni_Profesor
        WHERE C.id_clase = ?
    """;

    try (Connection conexion = con.estableConexion();
        PreparedStatement ps = conexion.prepareStatement(sql)) {

        ps.setString(1, idClase);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            datos = new ClaseCompleta(
                rs.getString("Horario"),
                rs.getDouble("Mensualidad"),
                rs.getString("Descripcion"),
                rs.getString("NombreProfesor")
            );
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return datos;
}
}
