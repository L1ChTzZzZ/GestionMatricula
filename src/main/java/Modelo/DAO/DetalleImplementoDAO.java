package Modelo.dao;

import Modelo.DetalleImplemento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DetalleImplementoDAO {
    private Connection connection;

    public DetalleImplementoDAO(Connection connection) {
        this.connection = connection;
    }

    // Agregar detalle de implemento
    public boolean agregarDetalle(DetalleImplemento detalle) {
        String sql = "INSERT INTO DETALLES_IMPLEMENTOS (id_boleta_implementos, Precio_unitario, id_matricula, id_implemento) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, detalle.getIdBoletaImplementos());
            ps.setDouble(2, detalle.getPrecioUnitario());
            ps.setString(3, detalle.getIdMatricula());
            ps.setString(4, detalle.getIdImplemento());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Buscar detalle por ID
    public DetalleImplemento buscarPorId(String idBoleta) {
        String sql = "SELECT * FROM DETALLES_IMPLEMENTOS WHERE id_boleta_implementos = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, idBoleta);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new DetalleImplemento(
                        rs.getString("id_boleta_implementos"),
                        rs.getDouble("Precio_unitario"),
                        rs.getString("id_matricula"),
                        rs.getString("id_implemento")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Actualizar detalle
    public boolean actualizarDetalle(DetalleImplemento detalle) {
        String sql = "UPDATE DETALLES_IMPLEMENTOS SET Precio_unitario = ?, id_matricula = ?, id_implemento = ? WHERE id_boleta_implementos = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            
            ps.setDouble(1, detalle.getPrecioUnitario());
            ps.setString(2, detalle.getIdMatricula());
            ps.setString(3, detalle.getIdImplemento());
            ps.setString(4, detalle.getIdBoletaImplementos());
            
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar detalle
    public boolean eliminarDetalle(String idBoleta) {
        String sql = "DELETE FROM DETALLES_IMPLEMENTOS WHERE id_boleta_implementos = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, idBoleta);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Listar todos los detalles
    public List<DetalleImplemento> listarDetalles() {
        List<DetalleImplemento> lista = new ArrayList<>();
        String sql = "SELECT * FROM DETALLES_IMPLEMENTOS";
        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new DetalleImplemento(
                        rs.getString("id_boleta_implementos"),
                        rs.getDouble("Precio_unitario"),
                        rs.getString("id_matricula"),
                        rs.getString("id_implemento")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}