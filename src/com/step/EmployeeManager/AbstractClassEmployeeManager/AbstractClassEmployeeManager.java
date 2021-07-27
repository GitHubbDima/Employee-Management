package com.step.EmployeeManager.AbstractClassEmployeeManager;

public abstract class AbstractClassEmployeeManager {

    private int id ;
    private String firstName;
    private String surName;
    private String idnp;
    private String department;
    private String function;
    private double salary;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
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

    public String getSurName() {
        return surName;
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
