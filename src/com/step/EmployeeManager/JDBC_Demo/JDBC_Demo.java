package com.step.EmployeeManager.JDBC_Demo;

import com.step.EmployeeManager.Employee.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBC_Demo {

    //Connection
    public List<Employee> readJDBC() throws SQLException {
        List<Employee> listEmployee = new ArrayList<>();
        String sql = " SELECT ID, FIRSTNAME, SURNAME FROM EMPLOYEE_MANAGER.EMPLOYEE; ";

        String url="jdbc:postgresql://127.0.0.1:5432/app";
        String username = "postgres";
        String password = "PostgresSQL";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            int id = resultSet.getInt("ID");
            String firstname = resultSet.getString("FIRSTNAME");
            String surname = resultSet.getString("SURNAME");
            listEmployee.add(new Employee(id, firstname, surname));

            System.out.println(
            "id:" + resultSet.getInt("ID") +
            ", firstname:" + resultSet.getString("FIRSTNAME") +
            ", lastname:" + resultSet.getString("SURNAME")
            );
        }
        return listEmployee;
    }
}
