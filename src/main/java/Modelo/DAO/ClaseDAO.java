package Modelo.DAO;

import Modelo.Clase;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClaseDAO {
    private Connection connection;

    public ClaseDAO(Connection connection) {
        this.connection = connection;
    }

    // Agregar clase
    public boolean agregarClase(Clase clase) {
        String sql = "INSERT INTO CLASES (id_clase, Horario, Mensualidad) VALUES (?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, clase.getIdClase());
            ps.setDate(2, clase.getHorario());
            ps.setDouble(3, clase.getMensualidad());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Buscar clase por ID
    public Clase buscarPorId(String idClase) {
        String sql = "SELECT * FROM CLASES WHERE id_clase = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, idClase);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Clase(
                        rs.getString("id_clase"),
                        rs.getDate("Horario"),
                        rs.getDouble("Mensualidad")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Actualizar clase
    public boolean actualizarClase(Clase clase) {
        String sql = "UPDATE CLASES SET Horario = ?, Mensualidad = ? WHERE id_clase = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setDate(1, clase.getHorario());
            ps.setDouble(2, clase.getMensualidad());
            ps.setString(3, clase.getIdClase());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar clase
    public boolean eliminarClase(String idClase) {
        String sql = "DELETE FROM CLASES WHERE id_clase = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, idClase);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Listar todas las clases
    public List<Clase> listarClases() {
        List<Clase> lista = new ArrayList<>();
        String sql = "SELECT * FROM CLASES";
        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Clase(
                        rs.getString("id_clase"),
                        rs.getDate("Horario"),
                        rs.getDouble("Mensualidad")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}