package com.step.EmployeeManager.Employee;

import com.step.EmployeeManager.AbstractClassEmployeeManager.AbstractClassEmployeeManager;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee extends AbstractClassEmployeeManager {

    private LocalDate employeedOn;
    LocalDate birthdate;
    Scanner in = new Scanner(System.in);
    List<Employee> employeeList = new ArrayList<>();

    public Employee(LocalDate employeedOn, LocalDate birthdate){
        this.employeedOn = employeedOn;
        this.birthdate = birthdate;
    }

    public LocalDate getEmployeedOn() {
        return employeedOn;
    }

    public void setEmployeedOn(LocalDate employeedOn) {
        this.employeedOn = employeedOn;
    }

    public int employeeRegistration(){
        Employee employee = new Employee(LocalDate.now(),LocalDate.of(2000,01,01));
        boolean continuy = true;
        int nextEmployment = 0;

        while (continuy){

            System.out.println("\t employment MENU \t");
            System.out.print(" Enter firstname: "); employee.setFirstName(in.next());
            System.out.print(" Enter lastname: "); employee.setLastName(in.next());
            System.out.print(" Enter idnp: "); employee.setIdnp(in.next());
            System.out.print(" Enter departament: "); employee.setDepartment(in.next());
            System.out.print(" Enter function: "); employee.setFunction(in.next());
            System.out.print(" Enter salary: "); employee.setSalary(in.nextDouble());
            System.out.print(" Enter date: "); employee.setEmployeedOn(LocalDate.parse(in.next()));
            int id = getId();
            if (id == 0){
                setId(1);
            }else{
                setId(++id);
            }
            employeeList.add(employee);

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
