package com.example.lab8.daos;
import java.sql.*;


public class ListaPrueba {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "1234";

        try {

            Connection conn = DriverManager.getConnection(url, user, password);
            String sql = "SELECT * FROM pelicula";
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("Título: " + rs.getString("titulo"));
                System.out.println("Director: " + rs.getString("director"));
                System.out.println(rs.getString("idPelicula"));
                System.out.println(rs.getString("titulo"));
                System.out.println(rs.getString("director"));
                System.out.println(rs.getString("anoPublicacion"));
                System.out.println(rs.getString("rating"));
                System.out.println(rs.getString("boxOffice"));
                System.out.println(rs.getString("idGenero"));

            }


            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


