package org.example.dao;

import org.example.models.Employee;

public interface EmployeeDao {
    public Employee getEmployeeByName(String name);
}
