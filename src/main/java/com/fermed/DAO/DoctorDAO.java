package com.fermed.DAO;

import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;

import java.sql.Connection;

public class DoctorDAO {
    //DoctorDAO will take the data from the database
    
    //creating connectioon with the database
    private static Connection connection = null;

    //return connection
    public static Connection getConnection(){
        if(connection != null){
            return connection;
        }else {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/fermed?serverTimezone=UTC";
        }
        return connection;
    }



}
