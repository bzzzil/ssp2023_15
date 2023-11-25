package org.example.service;

import org.example.dao.EmployeeDao;
import org.example.models.Employee;

public class Service {
    EmployeeDao dao;

    public Service(EmployeeDao dao) {
        this.dao = dao;
    }

    public boolean hasEmployee(String name)
    {
        return dao.getEmployeeByName(name) != null;
    }
}
