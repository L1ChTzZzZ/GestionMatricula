
package modelos.daos;

import modelos.Implemento;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ImplementoDAO {
    private Connection connection;

    public ImplementoDAO(Connection connection) {
        this.connection = connection;
    }

    // Agregar implemento
    public boolean agregarImplemento(Implemento imp) {
        String sql = "INSERT INTO IMPLEMENTO (id_implemento, Nombre, Tipo, Stock, Precio) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, imp.getIdImplemento());
            ps.setString(2, imp.getNombre());
            ps.setString(3, imp.getTipo());
            ps.setInt(4, imp.getStock());
            ps.setDouble(5, imp.getPrecio());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Buscar implemento por ID
    public Implemento buscarPorId(String idImplemento) {
        String sql = "SELECT * FROM IMPLEMENTO WHERE id_implemento = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, idImplemento);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Implemento(
                        rs.getString("id_implemento"),
                        rs.getString("Nombre"),
                        rs.getString("Tipo"),
                        rs.getInt("Stock"),
                        rs.getDouble("Precio")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Actualizar implemento
    public boolean actualizarImplemento(Implemento imp) {
        String sql = "UPDATE IMPLEMENTO SET Nombre = ?, Tipo = ?, Stock = ?, Precio = ? WHERE id_implemento = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, imp.getNombre());
            ps.setString(2, imp.getTipo());
            ps.setInt(3, imp.getStock());
            ps.setDouble(4, imp.getPrecio());
            ps.setString(5, imp.getIdImplemento());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar implemento
    public boolean eliminarImplemento(String idImplemento) {
        String sql = "DELETE FROM IMPLEMENTO WHERE id_implemento = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, idImplemento);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Listar todos los implementos
    public List<Implemento> listarImplementos() {
        List<Implemento> lista = new ArrayList<>();
        String sql = "SELECT * FROM IMPLEMENTO";
        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new Implemento(
                        rs.getString("id_implemento"),
                        rs.getString("Nombre"),
                        rs.getString("Tipo"),
                        rs.getInt("Stock"),
                        rs.getDouble("Precio")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}