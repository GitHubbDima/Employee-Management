package com.step.EmployeeManager.AbstractClassEmployeeManager;

import com.step.EmployeeManager.EmployeeManager;

public abstract class AbstractClassEmployeeManager {

    private int id ;
    private String firstName;
    private String lastName;
    private String idnp;
    private String department;
    private String function;
    private double salary;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdnp() {
        return idnp;
    }

    public String getDepartment() {
        return department;
    }

    public String getFunction() {
        return function;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
