package com.example.lab8.daos;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion{
    public static void main(String[] args) {
        BaseDao baseDao = new BaseDao() {};

        try (Connection conn = baseDao.getConnection()) {
            if (conn != null) {
                System.out.println("Conexión exitosa a la base de datos.");
            } else {
                System.out.println("Error en la conexión.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
