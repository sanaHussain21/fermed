package com.fermed.DAO.impl;

import com.fermed.DAO.AppointmentDAO;
import com.fermed.DAO.DatabaseDAO;
import com.fermed.model.Appointment;

import java.sql.Connection;
import java.sql.SQLException;

public class AppointmentDAOImpl implements AppointmentDAO {

    @Override
    public void createAppointment(Appointment appointment) throws SQLException {
        //connection for database
        Connection connection;
        connection = DatabaseDAO.getConnection();

        String insertQuery = "";
    }
}
