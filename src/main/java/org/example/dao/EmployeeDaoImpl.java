package org.example.dao;

import org.example.models.Employee;

import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    List<Employee> employee = List.of(
        new Employee("John Dow", "proger", 1000),
        new Employee("Jane Dow", "test", 2000)
    );

    @Override
    public Employee getEmployeeByName(String name) throws RuntimeException {
        return employee.stream().filter(
                (e) -> e.getName().equals(name)
        ).findFirst().orElseThrow();
    }
}
