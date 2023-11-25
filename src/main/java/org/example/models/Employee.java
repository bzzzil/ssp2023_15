package org.example.models;

public class Employee {
    int id;
    String name;
    String occupation;
    int salary;
    public Employee(String name, String occupation, int salary) {
        this.name = name;
        this.occupation = occupation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
