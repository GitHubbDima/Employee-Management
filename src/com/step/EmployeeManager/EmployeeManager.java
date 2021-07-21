package com.step.EmployeeManager;

import com.step.EmployeeManager.Employ.Employ;
import com.step.EmployeeManager.Menus.Menus;

import java.util.*;

public class EmployeeManager {

    Menus menu = new Menus();
    Employ employ = new Employ();
    List<Employ> listEmployes = new ArrayList<>();

    public void employeeManagement(){
        boolean exit = false;
        int result_employeeRegistration = 0;

        while(!exit){
            String resultMainMenu = menu.mainMenu();

            if (resultMainMenu.equals("Employ")){
                result_employeeRegistration = employ.employeeRegistration();
                listEmployes.add(employ);
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
