package Modelo.dao;

import Modelo.DetalleClase;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetalleClaseDAO {
    private Connection connection;

    public DetalleClaseDAO(Connection connection) {
        this.connection = connection;
    }

    // Agregar detalle de clase
    public boolean agregarDetalle(DetalleClase detalle) {
        String sql = "INSERT INTO DETALLES_CLASES (id_detalles_clases, Descripcion, id_clase, Dni_profesor) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, detalle.getIdDetallesClases());
            ps.setString(2, detalle.getDescripcion());
            ps.setString(3, detalle.getIdClase());
            ps.setString(4, detalle.getDniProfesor());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Buscar detalle por ID
    public DetalleClase buscarPorId(String idDetalle) {
        String sql = "SELECT * FROM DETALLES_CLASES WHERE id_detalles_clases = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, idDetalle);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new DetalleClase(
                        rs.getString("id_detalles_clases"),
                        rs.getString("Descripcion"),
                        rs.getString("id_clase"),
                        rs.getString("Dni_profesor")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Actualizar detalle de clase
    public boolean actualizarDetalle(DetalleClase detalle) {
        String sql = "UPDATE DETALLES_CLASES SET Descripcion = ?, id_clase = ?, Dni_profesor = ? WHERE id_detalles_clases = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, detalle.getDescripcion());
            ps.setString(2, detalle.getIdClase());
            ps.setString(3, detalle.getDniProfesor());
            ps.setString(4, detalle.getIdDetallesClases());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar detalle de clase
    public boolean eliminarDetalle(String idDetalle) {
        String sql = "DELETE FROM DETALLES_CLASES WHERE id_detalles_clases = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, idDetalle);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Listar todos los detalles de clases
    public List<DetalleClase> listarDetalles() {
        List<DetalleClase> lista = new ArrayList<>();
        String sql = "SELECT * FROM DETALLES_CLASES";
        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new DetalleClase(
                        rs.getString("id_detalles_clases"),
                        rs.getString("Descripcion"),
                        rs.getString("id_clase"),
                        rs.getString("Dni_profesor")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}