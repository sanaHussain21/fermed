package com.fermed.DAO;

import lombok.Data;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

@Data
@Service
public class DoctorDAO {
    //DoctorDAO will take the data from the database

    //creating connectioon with the database
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException{
        if (connection != null){
            return connection;
        }else{
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/fermed?serverTimezone=UTC";
            String username = "root";
            String password = "Sana_2001%%%";

            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, username, password);

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
