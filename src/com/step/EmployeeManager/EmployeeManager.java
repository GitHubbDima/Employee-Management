package com.step.EmployeeManager;

import com.step.EmployeeManager.Employee.Employee;
import com.step.EmployeeManager.Menus.Menus;

import java.time.LocalDate;
import java.util.*;

public class EmployeeManager {

    Menus menu = new Menus();
    Employee employee = new Employee(LocalDate.now(),LocalDate.of(2000,01,01));
    List<Employee> listEmployes = new ArrayList<>();

    public void employeeManagement(){
        boolean exit = false;
        int result_employeeRegistration = 0;

        while(!exit){
            String resultMainMenu = menu.mainMenu();

            if (resultMainMenu.equals("Employ")){
                result_employeeRegistration = employee.employeeRegistration();
                listEmployes.add(employee);
            }else if(resultMainMenu.equals("Dismissal")){
                menu.dismissalMenu();
            }else if(resultMainMenu.equals("Exit")){
                exit = true;
            }
            if (result_employeeRegistration == 3){
                exit = true;
                System.out.println(" Good by ");
            }
        }
    }

    public void showEmployes(){
    }



}
