package org.example.dao;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeDaoImplTest {

    @Test
    void getEmployeeByName() {
        EmployeeDaoImpl dao = new EmployeeDaoImpl();

        assertThat(dao.getEmployeeByName("John Dow").getName())
                .isEqualTo("John Dow");
        assertThatThrownBy(() -> { dao.getEmployeeByName("Not Exists!"); });
    }
}