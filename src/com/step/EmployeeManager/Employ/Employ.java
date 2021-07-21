package com.step.EmployeeManager.Employ;

import com.step.EmployeeManager.AbstractClassEmployeeManager.AbstractClassEmployeeManager;
import com.step.EmployeeManager.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employ extends AbstractClassEmployeeManager {

    private String dateOfEmployment;
    Scanner in = new Scanner(System.in);
    List<Employ> employList = new ArrayList<>();

    public String getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public int employeeRegistration(){
        Employ employ = new Employ();
        boolean continuy = true;
        int nextEmployment = 0;

        while (continuy){

            System.out.println("\t employment MENU \t");
            System.out.print(" Enter firstname: "); employ.setFirstName(in.next());
            System.out.print(" Enter lastname: "); employ.setLastName(in.next());
            System.out.print(" Enter idnp: "); employ.setIdnp(in.next());
            System.out.print(" Enter departament: "); employ.setDepartment(in.next());
            System.out.print(" Enter function: "); employ.setFunction(in.next());
            System.out.print(" Enter salary: "); employ.setSalary(in.nextDouble());
            System.out.print(" Enter date: "); employ.setDateOfEmployment(in.next());
            int id = getId();
            if (id == 0){
                setId(1);
            }else{
                setId(++id);
            }
            employList.add(employ);

            System.out.println(" Next employment? ");
            System.out.println(" 1.Yes.");
            System.out.println(" 2.Back to mainMenu.");
            System.out.println(" 3.Exit.");
            System.out.print(" Please, select a number in the list: "); nextEmployment = in.nextInt();

            if(nextEmployment == 2 || nextEmployment == 3){
                continuy = false;
            }
        }
        return nextEmployment;
    }
}
