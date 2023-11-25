package org.example.dao;

import org.example.models.Employee;

public interface EmployeeDao {
    Employee getEmployeeByName(String name);
}
