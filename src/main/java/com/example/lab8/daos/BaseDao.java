package com.example.lab8.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public abstract class BaseDao {

    public Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }

        String user = "root";
        String pass = "1234";
        String url = "jdbc:mysql://localhost:3306/mydb";

        return DriverManager.getConnection(url, user, pass);
    }
}
