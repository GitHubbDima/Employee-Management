package com.step.EmployeeManager;

import com.step.EmployeeManager.Employ.Employ;
import com.step.EmployeeManager.Menus.Menus;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.employeeManagement();
        employeeManager.showEmployes();


    }
}
