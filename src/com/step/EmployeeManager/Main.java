package com.step.EmployeeManager;

import com.step.EmployeeManager.Employee.Employee;
import com.step.EmployeeManager.JDBC_Demo.JDBC_Demo;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

 /*       EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.employeeManagement();
        employeeManager.showEmployes();*/

        JDBC_Demo postgreSQL = new JDBC_Demo();
        try {
            List<Employee> listEmployee= postgreSQL.readJDBC();
            for (Employee emp :
                    listEmployee) {
                System.out.println(emp);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
