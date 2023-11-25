package org.example.service;

import org.example.dao.EmployeeDao;
import org.example.models.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

class ServiceTest {
    @Mock
    EmployeeDao dao;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void employeeExists() {
        given(dao.getEmployeeByName("User")).willReturn(
                new Employee("User", "Role", 666)
        );
        Service srv = new Service(dao);

        assertThat(srv.hasEmployee("User")).isTrue();
        assertThat(srv.hasEmployee("User2")).isFalse();

        verify(dao).getEmployeeByName("User");
    }
}
