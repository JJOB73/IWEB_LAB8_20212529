package com.example.lab8.daos;

import com.example.lab8.beans.Pelicula;
import java.sql.*;
import java.util.ArrayList;

public class PeliculaDao extends BaseDao {

    public ArrayList<Pelicula> listarPeliculas() {
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        try (Connection conn = this.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM pelicula ORDER BY rating DESC, boxOffice DESC");) {

            while (rs.next()) {
                Pelicula pelicula = new Pelicula();
                pelicula.setIdPelicula(rs.getInt(0));
                pelicula.setTitulo(rs.getString(1));
                pelicula.setDirector(rs.getString(2));
                pelicula.setAnoPublicacion(rs.getInt(3));
                pelicula.setRating(rs.getDouble(4));
                pelicula.setBoxOffice(rs.getDouble(5));
                pelicula.setIdGenero(rs.getInt(6));
                peliculas.add(pelicula);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(peliculas);
        return peliculas;
    }

    public void eliminarPelicula(int idPelicula) {
        String sql = "DELETE FROM peliculas WHERE idPelicula = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idPelicula);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
