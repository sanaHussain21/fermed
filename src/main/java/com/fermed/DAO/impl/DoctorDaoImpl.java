package com.fermed.DAO.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.fermed.DAO.DatabaseDAO;
import com.fermed.DAO.DoctorDAO;
import com.fermed.DTO.DoctorDTO;
import com.fermed.DTO.DoctorData;
import com.fermed.model.Doctor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.stereotype.Component;

import javax.print.Doc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@Component
public class DoctorDaoImpl implements DoctorDAO {


    @Override
    public void createDoctor(Doctor doctor) throws SQLException {

        Connection connection;
        connection =  DatabaseDAO.getConnection();


        String insertQuery = "INSERT INTO doctor(name, surname, gender,id_type_of_doctor, insurance_id_insurance, email, password, username) " +
                "VALUES('"+doctor.getName()+"', '"+doctor.getSurname()+"', '"+doctor.getGender()+"', "+doctor.getId_type_of_doctor()+", "+doctor.getInsurance_id_insurance()+",  '"+doctor.getEmail()+"','"+doctor.getPassword()+"','"+doctor.getUsername()+"')";

        try{
            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
            preparedStatement.executeUpdate();
            System.out.println("DOCTOR REGISTERED SUCCESSFULLY! :)");
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    /*
 //my login code
@Override
    public void doctorData(DoctorDTO doctorDTO) throws Exception {

        Connection connection;
        connection =  DatabaseDAO.getConnection();

        //ArrayList doctorData1 = new ArrayList();

        try {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT name, surname, gender, username ,email FROM doctor WHERE email = '"+doctorDTO.getEmail()+"' ");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
                //for testing
            System.out.println("Email is : " + doctorDTO.getEmail());
            System.out.println(resultSet.getString(1) + ",   " + resultSet.getString(2)+ ",   " + resultSet.getString(3)+ ",   " + resultSet.getString(4)+ ",   "+ resultSet.getString(5)+ "   ");

        }

    } catch (Exception ex) {
           ex.printStackTrace();

        }

    }
*/

    /*
    * this code is woring but it is returing null to the whole object
    *
    * @Override
    public Doctor loginDoctor(Doctor doctor1) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseDAO.getConnection();

            String query = "SELECT name, surname, gender, username, email, password FROM doctor WHERE email = ? AND password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, doctor1.getEmail());
            preparedStatement.setString(2, doctor1.getPassword());

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("DOCTOR LOGIN SUCCESSFULLY!!");
                System.out.println("DOCTOR EMAIL: " + doctor1.getEmail());
                System.out.println("DOCTOR PASSWORD: " + doctor1.getPassword());

                System.out.println(
                        resultSet.getString(1) + ",   " +
                                resultSet.getString(2) + ",   " +
                                resultSet.getString(3) + ",   " +
                                resultSet.getString(4) + ",   " +
                                resultSet.getString(5) + "   "
                );
            } else {
                System.out.println("DOCTOR LOGIN FAILED, DOCTOR WITH THIS EMAIL NOT FOUND!!!"+doctor1.getEmail());
                System.out.println("DOCTOR LOGIN FAILED, DOCTOR WITH THIS  PASSWORD NOT FOUND!!!"+doctor1.getPassword());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctor1;
    }

    *
    *
    *
    * */


/**/
    @Override
    public Doctor loginDoctor(Doctor doctor) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        try {
            connection = DatabaseDAO.getConnection();

            String query = "SELECT name, surname, gender, username, email, password FROM doctor WHERE email = ? AND password = ?";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, doctor.getEmail());
            preparedStatement.setString(2, doctor.getPassword());

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                System.out.println("DOCTOR LOGIN SUCCESSFULLY!!");
                System.out.println("DOCTOR EMAIL: " + doctor.getEmail());
                System.out.println("DOCTOR PASSWORD: " + doctor.getPassword());

                doctor.setName(resultSet.getString("name"));
                doctor.setSurname(resultSet.getString("surname"));
                doctor.setGender(resultSet.getString("gender"));
                doctor.setUsername(resultSet.getString("username"));
            } else {
                System.out.println("DOCTOR LOGIN FAILED, DOCTOR WITH THIS EMAIL NOT FOUND!!!"+doctor.getEmail());
                System.out.println("DOCTOR LOGIN FAILED, DOCTOR WITH THIS  PASSWORD NOT FOUND!!!"+doctor.getPassword());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return doctor;
    }






    @Override
    public void doctorData(DoctorDTO doctorDTO) throws Exception {

        Connection connection;
        connection =  DatabaseDAO.getConnection();

        //ArrayList doctorData1 = new ArrayList();

        try {
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT name, surname, gender, username ,email FROM doctor WHERE email = '"+doctorDTO.getEmail()+"' ");
        ResultSet resultSet = preparedStatement.executeQuery();
        while(resultSet.next()){
                //for testing
            System.out.println("Email is : " + doctorDTO.getEmail());
            System.out.println(resultSet.getString(1) + ",   " + resultSet.getString(2)+ ",   " + resultSet.getString(3)+ ",   " + resultSet.getString(4)+ ",   "+ resultSet.getString(5)+ "   ");

        }

    } catch (Exception ex) {
           ex.printStackTrace();

        }

    }
    /*
    @Override
    public void getDoctorDepartment(DoctorDTO doctorDTO) throws SQLException {

        Connection connection;
        connection =  DatabaseDAO.getConnection();


        try {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT doctor.name, doctor.surname, type_of_doctor.nome FROM doctor INNER JOIN  type_of_doctor USING(id_type_of_doctor) WHERE doctor.name = '"+doctorDTO.getName()+"' AND doctor.surname = '"+doctorDTO.getSurname()+"' ");
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){


                System.out.println(resultSet.getString(1) + ",   " + resultSet.getString(2)+ ",   " + resultSet.getString(3)+ ",");

                //SELECT doctor.name, doctor.surname, type_of_doctor.nome FROM doctor INNER JOIN  type_of_doctor USING(id_type_of_doctor) WHERE doctor.name = 'Enrico' AND doctor.surname = 'Pugliesi'
                //"SELECT name, surname, gender, username ,email FROM doctor WHERE email = '"+doctorDTO.getEmail()+"' "

            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
*/

}

